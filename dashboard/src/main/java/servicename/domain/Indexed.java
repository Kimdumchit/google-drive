package servicename.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import servicename.infra.AbstractEvent;

@Data
public class Indexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private List<String> keywords;
}
