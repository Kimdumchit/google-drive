package servicename.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import servicename.config.kafka.KafkaProcessor;
import servicename.domain.*;

//<<< Clean Arch / Inbound Adaptor
@Service
@Transactional
public class PolicyHandler {

    @Autowired
    IndexRepository indexRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploded'"
    )
    public void wheneverFileUploded_MakeIndex(
        @Payload FileUploded fileUploded
    ) {
        FileUploded event = fileUploded;
        System.out.println(
            "\n\n##### listener MakeIndex : " + fileUploded + "\n\n"
        );

        // Sample Logic //
        Index.makeIndex(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
