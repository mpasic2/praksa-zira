package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.franchise.FranchiseCreateRequest;
import ba.com.zira.praksa.api.model.franchise.FranchiseResponse;
import ba.com.zira.praksa.api.model.franchise.FranchiseUpdateRequest;
import ba.com.zira.praksa.dao.model.FranchiseEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-29T23:59:13+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class FranchiseMapperImpl implements FranchiseMapper {

    @Override
    public FranchiseResponse franchiseEntityToFranchise(FranchiseEntity sampleModelEntity) {
        if ( sampleModelEntity == null ) {
            return null;
        }

        FranchiseResponse franchiseResponse = new FranchiseResponse();

        franchiseResponse.setName( sampleModelEntity.getName() );
        franchiseResponse.setId( sampleModelEntity.getId() );
        franchiseResponse.setAliases( sampleModelEntity.getAliases() );
        franchiseResponse.setCreated( sampleModelEntity.getCreated() );
        franchiseResponse.setCreatedBy( sampleModelEntity.getCreatedBy() );
        franchiseResponse.setInformation( sampleModelEntity.getInformation() );
        franchiseResponse.setModified( sampleModelEntity.getModified() );
        franchiseResponse.setModifiedBy( sampleModelEntity.getModifiedBy() );
        franchiseResponse.setOutlineText( sampleModelEntity.getOutlineText() );

        return franchiseResponse;
    }

    @Override
    public FranchiseEntity franchiseToFranchiseEntity(FranchiseCreateRequest sampleModel) {
        if ( sampleModel == null ) {
            return null;
        }

        FranchiseEntity franchiseEntity = new FranchiseEntity();

        franchiseEntity.setName( sampleModel.getName() );
        franchiseEntity.setAliases( sampleModel.getAliases() );
        franchiseEntity.setInformation( sampleModel.getInformation() );
        franchiseEntity.setOutlineText( sampleModel.getOutlineText() );

        return franchiseEntity;
    }

    @Override
    public void updateForFranchiseUpdate(FranchiseUpdateRequest franchiseModel, FranchiseEntity franchiseEntity) {
        if ( franchiseModel == null ) {
            return;
        }

        franchiseEntity.setId( franchiseModel.getId() );
        franchiseEntity.setAliases( franchiseModel.getAliases() );
        franchiseEntity.setInformation( franchiseModel.getInformation() );
        franchiseEntity.setName( franchiseModel.getName() );
        franchiseEntity.setOutlineText( franchiseModel.getOutlineText() );
    }

    @Override
    public FranchiseEntity dtoToEntity(FranchiseCreateRequest sample) {
        if ( sample == null ) {
            return null;
        }

        FranchiseEntity franchiseEntity = new FranchiseEntity();

        franchiseEntity.setAliases( sample.getAliases() );
        franchiseEntity.setInformation( sample.getInformation() );
        franchiseEntity.setName( sample.getName() );
        franchiseEntity.setOutlineText( sample.getOutlineText() );

        return franchiseEntity;
    }

    @Override
    public FranchiseResponse entityToDto(FranchiseEntity billingPeriodEntity) {
        if ( billingPeriodEntity == null ) {
            return null;
        }

        FranchiseResponse franchiseResponse = new FranchiseResponse();

        franchiseResponse.setId( billingPeriodEntity.getId() );
        franchiseResponse.setAliases( billingPeriodEntity.getAliases() );
        franchiseResponse.setCreated( billingPeriodEntity.getCreated() );
        franchiseResponse.setCreatedBy( billingPeriodEntity.getCreatedBy() );
        franchiseResponse.setInformation( billingPeriodEntity.getInformation() );
        franchiseResponse.setModified( billingPeriodEntity.getModified() );
        franchiseResponse.setModifiedBy( billingPeriodEntity.getModifiedBy() );
        franchiseResponse.setName( billingPeriodEntity.getName() );
        franchiseResponse.setOutlineText( billingPeriodEntity.getOutlineText() );

        return franchiseResponse;
    }
}
