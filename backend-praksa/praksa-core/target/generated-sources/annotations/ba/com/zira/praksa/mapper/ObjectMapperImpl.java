package ba.com.zira.praksa.mapper;

import ba.com.zira.commons.model.PagedData;
import ba.com.zira.praksa.api.model.object.ObjectCreateRequest;
import ba.com.zira.praksa.api.model.object.ObjectResponse;
import ba.com.zira.praksa.api.model.object.ObjectUpdateRequest;
import ba.com.zira.praksa.dao.model.ObjectEntity;
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
public class ObjectMapperImpl implements ObjectMapper {

    @Override
    public ObjectEntity dtoToEntity(ObjectResponse sample) {
        if ( sample == null ) {
            return null;
        }

        ObjectEntity objectEntity = new ObjectEntity();

        objectEntity.setId( sample.getId() );
        objectEntity.setAliases( sample.getAliases() );
        objectEntity.setCreated( sample.getCreated() );
        objectEntity.setCreatedBy( sample.getCreatedBy() );
        objectEntity.setInformation( sample.getInformation() );
        objectEntity.setModified( sample.getModified() );
        objectEntity.setModifiedBy( sample.getModifiedBy() );
        objectEntity.setName( sample.getName() );

        return objectEntity;
    }

    @Override
    public ObjectEntity dtoToEntity(ObjectCreateRequest sample) {
        if ( sample == null ) {
            return null;
        }

        ObjectEntity objectEntity = new ObjectEntity();

        objectEntity.setAliases( sample.getAliases() );
        objectEntity.setInformation( sample.getInformation() );
        objectEntity.setName( sample.getName() );

        return objectEntity;
    }

    @Override
    public void updateDtoToEntity(ObjectUpdateRequest objectDto, ObjectEntity objectEntity) {
        if ( objectDto == null ) {
            return;
        }

        objectEntity.setId( objectDto.getId() );
        objectEntity.setAliases( objectDto.getAliases() );
        objectEntity.setInformation( objectDto.getInformation() );
        objectEntity.setName( objectDto.getName() );
    }

    @Override
    public ObjectResponse entityToDto(ObjectEntity objectEntity) {
        if ( objectEntity == null ) {
            return null;
        }

        ObjectResponse objectResponse = new ObjectResponse();

        objectResponse.setId( objectEntity.getId() );
        objectResponse.setAliases( objectEntity.getAliases() );
        objectResponse.setCreated( objectEntity.getCreated() );
        objectResponse.setCreatedBy( objectEntity.getCreatedBy() );
        objectResponse.setInformation( objectEntity.getInformation() );
        objectResponse.setModified( objectEntity.getModified() );
        objectResponse.setModifiedBy( objectEntity.getModifiedBy() );
        objectResponse.setName( objectEntity.getName() );

        return objectResponse;
    }

    @Override
    public PagedData<ObjectResponse> entitiesToDtos(PagedData<ObjectEntity> objectEntities) {
        if ( objectEntities == null ) {
            return null;
        }

        PagedData<ObjectResponse> pagedData = new PagedData<ObjectResponse>();

        pagedData.setRecords( entityListToDtoList( objectEntities.getRecords() ) );
        pagedData.setRecordsPerPage( objectEntities.getRecordsPerPage() );
        pagedData.setPage( objectEntities.getPage() );
        pagedData.setNumberOfPages( objectEntities.getNumberOfPages() );
        pagedData.setNumberOfRecords( objectEntities.getNumberOfRecords() );

        return pagedData;
    }

    @Override
    public ObjectCreateRequest updateToCreateRequest(ObjectUpdateRequest update) {
        if ( update == null ) {
            return null;
        }

        ObjectCreateRequest objectCreateRequest = new ObjectCreateRequest();

        objectCreateRequest.setAliases( update.getAliases() );
        objectCreateRequest.setInformation( update.getInformation() );
        objectCreateRequest.setName( update.getName() );

        return objectCreateRequest;
    }

    @Override
    public List<ObjectResponse> entityListToDtoList(List<ObjectEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ObjectResponse> list = new ArrayList<ObjectResponse>( entityList.size() );
        for ( ObjectEntity objectEntity : entityList ) {
            list.add( entityToDto( objectEntity ) );
        }

        return list;
    }
}
