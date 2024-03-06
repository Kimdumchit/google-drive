package servicename.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import servicename.domain.*;
import servicename.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FileUploded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private String type;
    private String userId;

    public FileUploded(File aggregate) {
        super(aggregate);
    }

    public FileUploded() {
        super();
    }
}
//>>> DDD / Domain Event
