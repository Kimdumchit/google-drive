package servicename.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import servicename.infra.AbstractEvent;

@Data
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private String videoUrl;
    private Long fileKey;
}
