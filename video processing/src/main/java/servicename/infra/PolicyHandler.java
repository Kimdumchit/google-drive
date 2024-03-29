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
    VideoRepository videoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploded'"
    )
    public void wheneverFileUploded_ProcessVideo(
        @Payload FileUploded fileUploded
    ) {
        FileUploded event = fileUploded;
        System.out.println(
            "\n\n##### listener ProcessVideo : " + fileUploded + "\n\n"
        );

        // Sample Logic //
        Video.processVideo(event);
    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='FileUploded'"
    )
    public void wheneverFileUploded_ProcessVideo(
        @Payload FileUploded fileUploded
    ) {
        FileUploded event = fileUploded;
        System.out.println(
            "\n\n##### listener ProcessVideo : " + fileUploded + "\n\n"
        );

        // Sample Logic //
        Video.processVideo(event);
    }
}
//>>> Clean Arch / Inbound Adaptor
