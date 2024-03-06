package servicename.domain;

import java.util.*;
import lombok.*;
import servicename.domain.*;
import servicename.infra.AbstractEvent;

@Data
@ToString
public class FileUploded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private String type;
    private String userId;
}
