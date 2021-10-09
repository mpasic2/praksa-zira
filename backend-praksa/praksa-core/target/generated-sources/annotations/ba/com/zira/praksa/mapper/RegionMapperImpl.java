package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.region.RegionCreateRequest;
import ba.com.zira.praksa.api.model.region.RegionResponse;
import ba.com.zira.praksa.api.model.region.RegionUpdateRequest;
import ba.com.zira.praksa.dao.model.RegionEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-29T23:59:13+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class RegionMapperImpl implements RegionMapper {

    @Override
    public RegionResponse regionEntityToRegion(RegionEntity sampleModelEntity) {
        if ( sampleModelEntity == null ) {
            return null;
        }

        RegionResponse regionResponse = new RegionResponse();

        regionResponse.setName( sampleModelEntity.getName() );
        regionResponse.setCreated( sampleModelEntity.getCreated() );
        regionResponse.setCreatedBy( sampleModelEntity.getCreatedBy() );
        regionResponse.setModified( sampleModelEntity.getModified() );
        regionResponse.setModifiedBy( sampleModelEntity.getModifiedBy() );
        regionResponse.setDescription( sampleModelEntity.getDescription() );

        return regionResponse;
    }

    @Override
    public RegionEntity regionToRegionEntity(RegionCreateRequest sampleModel) {
        if ( sampleModel == null ) {
            return null;
        }

        RegionEntity regionEntity = new RegionEntity();

        regionEntity.setName( sampleModel.getName() );
        regionEntity.setCreated( sampleModel.getCreated() );
        regionEntity.setCreatedBy( sampleModel.getCreatedBy() );
        regionEntity.setDescription( sampleModel.getDescription() );

        return regionEntity;
    }

    @Override
    public void updateForRegionUpdate(RegionUpdateRequest regionModel, RegionEntity regionEntity) {
        if ( regionModel == null ) {
            return;
        }

        regionEntity.setId( regionModel.getId() );
        regionEntity.setDescription( regionModel.getDescription() );
        regionEntity.setName( regionModel.getName() );
    }

    @Override
    public RegionEntity dtoToEntity(RegionCreateRequest sample) {
        if ( sample == null ) {
            return null;
        }

        RegionEntity regionEntity = new RegionEntity();

        regionEntity.setCreated( sample.getCreated() );
        regionEntity.setCreatedBy( sample.getCreatedBy() );
        regionEntity.setDescription( sample.getDescription() );
        regionEntity.setName( sample.getName() );

        return regionEntity;
    }

    @Override
    public RegionResponse entityToDto(RegionEntity billingPeriodEntity) {
        if ( billingPeriodEntity == null ) {
            return null;
        }

        RegionResponse regionResponse = new RegionResponse();

        regionResponse.setCreated( billingPeriodEntity.getCreated() );
        regionResponse.setCreatedBy( billingPeriodEntity.getCreatedBy() );
        regionResponse.setModified( billingPeriodEntity.getModified() );
        regionResponse.setModifiedBy( billingPeriodEntity.getModifiedBy() );
        regionResponse.setDescription( billingPeriodEntity.getDescription() );
        regionResponse.setName( billingPeriodEntity.getName() );

        return regionResponse;
    }
}
