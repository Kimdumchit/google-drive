package servicename.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import servicename.infra.AbstractEvent;

@Data
public class FileUploded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private String type;
    private String userId;
}
