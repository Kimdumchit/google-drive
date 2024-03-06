package servicename.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import servicename.domain.*;
import servicename.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class Indexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private List<String> keywords;

    public Indexed(Index aggregate) {
        super(aggregate);
    }

    public Indexed() {
        super();
    }
}
//>>> DDD / Domain Event
