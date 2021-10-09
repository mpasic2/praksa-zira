package ba.com.zira.praksa.mapper;

import ba.com.zira.commons.model.PagedData;
import ba.com.zira.praksa.api.model.feature.FeatureCreateRequest;
import ba.com.zira.praksa.api.model.feature.FeatureResponse;
import ba.com.zira.praksa.api.model.feature.FeatureUpdateRequest;
import ba.com.zira.praksa.dao.model.FeatureEntity;
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
public class FeatureMapperImpl implements FeatureMapper {

    @Override
    public FeatureEntity dtoToEntity(FeatureCreateRequest featureDto) {
        if ( featureDto == null ) {
            return null;
        }

        FeatureEntity featureEntity = new FeatureEntity();

        featureEntity.setDescription( featureDto.getDescription() );
        featureEntity.setName( featureDto.getName() );
        featureEntity.setType( featureDto.getType() );

        return featureEntity;
    }

    @Override
    public void updateDtoToEntity(FeatureUpdateRequest featureDto, FeatureEntity featureEntity) {
        if ( featureDto == null ) {
            return;
        }

        featureEntity.setId( featureDto.getId() );
        featureEntity.setDescription( featureDto.getDescription() );
        featureEntity.setName( featureDto.getName() );
        featureEntity.setType( featureDto.getType() );
    }

    @Override
    public FeatureResponse entityToDto(FeatureEntity featureEntity) {
        if ( featureEntity == null ) {
            return null;
        }

        FeatureResponse featureResponse = new FeatureResponse();

        featureResponse.setId( featureEntity.getId() );
        featureResponse.setName( featureEntity.getName() );
        featureResponse.setDescription( featureEntity.getDescription() );
        featureResponse.setType( featureEntity.getType() );
        featureResponse.setCreated( featureEntity.getCreated() );
        featureResponse.setCreatedBy( featureEntity.getCreatedBy() );
        featureResponse.setModified( featureEntity.getModified() );
        featureResponse.setModifiedBy( featureEntity.getModifiedBy() );

        return featureResponse;
    }

    @Override
    public List<FeatureResponse> entitiesToDtos(List<FeatureEntity> featureEntities) {
        if ( featureEntities == null ) {
            return null;
        }

        List<FeatureResponse> list = new ArrayList<FeatureResponse>( featureEntities.size() );
        for ( FeatureEntity featureEntity : featureEntities ) {
            list.add( entityToDto( featureEntity ) );
        }

        return list;
    }

    @Override
    public PagedData<FeatureResponse> entitiesToDtos(PagedData<FeatureEntity> featureEntities) {
        if ( featureEntities == null ) {
            return null;
        }

        PagedData<FeatureResponse> pagedData = new PagedData<FeatureResponse>();

        pagedData.setRecords( entitiesToDtos( featureEntities.getRecords() ) );
        pagedData.setRecordsPerPage( featureEntities.getRecordsPerPage() );
        pagedData.setPage( featureEntities.getPage() );
        pagedData.setNumberOfPages( featureEntities.getNumberOfPages() );
        pagedData.setNumberOfRecords( featureEntities.getNumberOfRecords() );

        return pagedData;
    }

    @Override
    public FeatureCreateRequest updateToCreateRequest(FeatureUpdateRequest update) {
        if ( update == null ) {
            return null;
        }

        FeatureCreateRequest featureCreateRequest = new FeatureCreateRequest();

        featureCreateRequest.setName( update.getName() );
        featureCreateRequest.setDescription( update.getDescription() );
        featureCreateRequest.setType( update.getType() );

        return featureCreateRequest;
    }
}
