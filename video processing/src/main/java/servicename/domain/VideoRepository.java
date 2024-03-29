package servicename.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import servicename.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "videos", path = "videos")
public interface VideoRepository
    extends PagingAndSortingRepository<Video, Long> {}
