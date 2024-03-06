package servicename.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import servicename.domain.*;
import servicename.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private Long fileKey;

    public VideoProcessed(Video aggregate) {
        super(aggregate);
    }

    public VideoProcessed() {
        super();
    }
}
//>>> DDD / Domain Event
