package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.mediastore.MediaStoreCreateRequest;
import ba.com.zira.praksa.api.model.mediastore.MediaStoreResponse;
import ba.com.zira.praksa.api.model.mediastore.MediaStoreUpdateRequest;
import ba.com.zira.praksa.dao.model.MediaStoreEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-29T23:59:13+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class MediaStoreMapperImpl implements MediaStoreMapper {

    @Override
    public MediaStoreEntity responseToEntity(MediaStoreResponse mediaStoreResponse) {
        if ( mediaStoreResponse == null ) {
            return null;
        }

        MediaStoreEntity mediaStoreEntity = new MediaStoreEntity();

        mediaStoreEntity.setUuid( mediaStoreResponse.getUuid() );
        mediaStoreEntity.setCreated( mediaStoreResponse.getCreated() );
        mediaStoreEntity.setCreatedBy( mediaStoreResponse.getCreatedBy() );
        mediaStoreEntity.setModified( mediaStoreResponse.getModified() );
        mediaStoreEntity.setModifiedBy( mediaStoreResponse.getModifiedBy() );
        mediaStoreEntity.setName( mediaStoreResponse.getName() );
        mediaStoreEntity.setType( mediaStoreResponse.getType() );
        mediaStoreEntity.setUrl( mediaStoreResponse.getUrl() );
        mediaStoreEntity.setExtension( mediaStoreResponse.getExtension() );

        return mediaStoreEntity;
    }

    @Override
    public MediaStoreResponse entityToResponse(MediaStoreEntity mediaStoreEntity) {
        if ( mediaStoreEntity == null ) {
            return null;
        }

        MediaStoreResponse mediaStoreResponse = new MediaStoreResponse();

        mediaStoreResponse.setUuid( mediaStoreEntity.getUuid() );
        mediaStoreResponse.setCreated( mediaStoreEntity.getCreated() );
        mediaStoreResponse.setCreatedBy( mediaStoreEntity.getCreatedBy() );
        mediaStoreResponse.setModified( mediaStoreEntity.getModified() );
        mediaStoreResponse.setModifiedBy( mediaStoreEntity.getModifiedBy() );
        mediaStoreResponse.setName( mediaStoreEntity.getName() );
        mediaStoreResponse.setType( mediaStoreEntity.getType() );
        mediaStoreResponse.setUrl( mediaStoreEntity.getUrl() );
        mediaStoreResponse.setExtension( mediaStoreEntity.getExtension() );

        return mediaStoreResponse;
    }

    @Override
    public MediaStoreEntity updateRequestToEntity(MediaStoreUpdateRequest mediaStoreUpdateRequest, MediaStoreEntity mediaStoreEntity) {
        if ( mediaStoreUpdateRequest == null ) {
            return null;
        }

        mediaStoreEntity.setUuid( mediaStoreUpdateRequest.getUuid() );
        mediaStoreEntity.setName( mediaStoreUpdateRequest.getName() );
        mediaStoreEntity.setType( mediaStoreUpdateRequest.getType() );
        mediaStoreEntity.setUrl( mediaStoreUpdateRequest.getUrl() );
        mediaStoreEntity.setExtension( mediaStoreUpdateRequest.getExtension() );

        return mediaStoreEntity;
    }

    @Override
    public MediaStoreEntity createRequestToEntity(MediaStoreCreateRequest mediaStoreCreateRequest) {
        if ( mediaStoreCreateRequest == null ) {
            return null;
        }

        MediaStoreEntity mediaStoreEntity = new MediaStoreEntity();

        mediaStoreEntity.setName( mediaStoreCreateRequest.getName() );
        mediaStoreEntity.setType( mediaStoreCreateRequest.getType() );
        mediaStoreEntity.setUrl( mediaStoreCreateRequest.getUrl() );
        mediaStoreEntity.setExtension( mediaStoreCreateRequest.getExtension() );

        return mediaStoreEntity;
    }

    @Override
    public List<MediaStoreResponse> entityListToResponseList(List<MediaStoreEntity> mediaStoreEntityList) {
        if ( mediaStoreEntityList == null ) {
            return null;
        }

        List<MediaStoreResponse> list = new ArrayList<MediaStoreResponse>( mediaStoreEntityList.size() );
        for ( MediaStoreEntity mediaStoreEntity : mediaStoreEntityList ) {
            list.add( entityToResponse( mediaStoreEntity ) );
        }

        return list;
    }
}
