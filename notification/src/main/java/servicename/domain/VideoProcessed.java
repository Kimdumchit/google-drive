package servicename.domain;

import java.util.*;
import lombok.*;
import servicename.domain.*;
import servicename.infra.AbstractEvent;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private Long fileKey;
}
