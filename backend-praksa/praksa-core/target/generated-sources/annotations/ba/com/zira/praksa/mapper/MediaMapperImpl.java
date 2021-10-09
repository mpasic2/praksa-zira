package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.media.Media;
import ba.com.zira.praksa.dao.model.MediaEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-29T23:59:13+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class MediaMapperImpl implements MediaMapper {

    @Override
    public Media entityToDto(MediaEntity mediaEntity) {
        if ( mediaEntity == null ) {
            return null;
        }

        Media media = new Media();

        media.setId( mediaEntity.getId() );
        media.setCreated( mediaEntity.getCreated() );
        media.setCreatedBy( mediaEntity.getCreatedBy() );
        media.setModified( mediaEntity.getModified() );
        media.setModifiedBy( mediaEntity.getModifiedBy() );
        media.setObjectId( mediaEntity.getObjectId() );
        media.setObjectType( mediaEntity.getObjectType() );

        return media;
    }

    @Override
    public MediaEntity dtoToEntity(Media entity) {
        if ( entity == null ) {
            return null;
        }

        MediaEntity mediaEntity = new MediaEntity();

        mediaEntity.setId( entity.getId() );
        mediaEntity.setCreated( entity.getCreated() );
        mediaEntity.setCreatedBy( entity.getCreatedBy() );
        mediaEntity.setModified( entity.getModified() );
        mediaEntity.setModifiedBy( entity.getModifiedBy() );
        mediaEntity.setObjectId( entity.getObjectId() );
        mediaEntity.setObjectType( entity.getObjectType() );

        return mediaEntity;
    }
}
