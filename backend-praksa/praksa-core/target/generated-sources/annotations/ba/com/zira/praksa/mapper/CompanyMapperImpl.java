package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.company.CompanyCreateRequest;
import ba.com.zira.praksa.api.model.company.CompanyResponse;
import ba.com.zira.praksa.api.model.company.CompanyUpdateRequest;
import ba.com.zira.praksa.dao.model.CompanyEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-29T23:59:13+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public CompanyResponse companyEntityToCompany(CompanyEntity sampleModelEntity) {
        if ( sampleModelEntity == null ) {
            return null;
        }

        CompanyResponse companyResponse = new CompanyResponse();

        companyResponse.setName( sampleModelEntity.getName() );
        companyResponse.setId( sampleModelEntity.getId() );
        companyResponse.setAddress( sampleModelEntity.getAddress() );
        companyResponse.setCity( sampleModelEntity.getCity() );
        companyResponse.setCountry( sampleModelEntity.getCountry() );
        companyResponse.setCreated( sampleModelEntity.getCreated() );
        companyResponse.setCreatedBy( sampleModelEntity.getCreatedBy() );
        companyResponse.setEmail( sampleModelEntity.getEmail() );
        companyResponse.setEndDate( sampleModelEntity.getEndDate() );
        companyResponse.setInformation( sampleModelEntity.getInformation() );
        companyResponse.setModified( sampleModelEntity.getModified() );
        companyResponse.setModifiedBy( sampleModelEntity.getModifiedBy() );
        companyResponse.setOutlineText( sampleModelEntity.getOutlineText() );
        companyResponse.setStartDate( sampleModelEntity.getStartDate() );
        companyResponse.setTelNumber( sampleModelEntity.getTelNumber() );
        companyResponse.setWebsite( sampleModelEntity.getWebsite() );

        return companyResponse;
    }

    @Override
    public CompanyEntity companyToCompanyEntity(CompanyCreateRequest sampleModel) {
        if ( sampleModel == null ) {
            return null;
        }

        CompanyEntity companyEntity = new CompanyEntity();

        companyEntity.setName( sampleModel.getName() );
        companyEntity.setAddress( sampleModel.getAddress() );
        companyEntity.setCity( sampleModel.getCity() );
        companyEntity.setCountry( sampleModel.getCountry() );
        companyEntity.setEmail( sampleModel.getEmail() );
        companyEntity.setEndDate( sampleModel.getEndDate() );
        companyEntity.setInformation( sampleModel.getInformation() );
        companyEntity.setOutlineText( sampleModel.getOutlineText() );
        companyEntity.setStartDate( sampleModel.getStartDate() );
        companyEntity.setTelNumber( sampleModel.getTelNumber() );
        companyEntity.setWebsite( sampleModel.getWebsite() );

        return companyEntity;
    }

    @Override
    public CompanyEntity companyResToCompanyEntity(CompanyCreateRequest sampleModel) {
        if ( sampleModel == null ) {
            return null;
        }

        CompanyEntity companyEntity = new CompanyEntity();

        companyEntity.setName( sampleModel.getName() );
        companyEntity.setAddress( sampleModel.getAddress() );
        companyEntity.setCity( sampleModel.getCity() );
        companyEntity.setCountry( sampleModel.getCountry() );
        companyEntity.setEmail( sampleModel.getEmail() );
        companyEntity.setEndDate( sampleModel.getEndDate() );
        companyEntity.setInformation( sampleModel.getInformation() );
        companyEntity.setOutlineText( sampleModel.getOutlineText() );
        companyEntity.setStartDate( sampleModel.getStartDate() );
        companyEntity.setTelNumber( sampleModel.getTelNumber() );
        companyEntity.setWebsite( sampleModel.getWebsite() );

        return companyEntity;
    }

    @Override
    public void updateForCompanyUpdate(CompanyUpdateRequest companyModel, CompanyEntity companyEntity) {
        if ( companyModel == null ) {
            return;
        }

        companyEntity.setId( companyModel.getId() );
        companyEntity.setAddress( companyModel.getAddress() );
        companyEntity.setCity( companyModel.getCity() );
        companyEntity.setCountry( companyModel.getCountry() );
        companyEntity.setEmail( companyModel.getEmail() );
        companyEntity.setEndDate( companyModel.getEndDate() );
        companyEntity.setInformation( companyModel.getInformation() );
        companyEntity.setName( companyModel.getName() );
        companyEntity.setOutlineText( companyModel.getOutlineText() );
        companyEntity.setStartDate( companyModel.getStartDate() );
        companyEntity.setTelNumber( companyModel.getTelNumber() );
        companyEntity.setWebsite( companyModel.getWebsite() );
    }

    @Override
    public CompanyEntity dtoToEntity(CompanyCreateRequest sample) {
        if ( sample == null ) {
            return null;
        }

        CompanyEntity companyEntity = new CompanyEntity();

        companyEntity.setAddress( sample.getAddress() );
        companyEntity.setCity( sample.getCity() );
        companyEntity.setCountry( sample.getCountry() );
        companyEntity.setEmail( sample.getEmail() );
        companyEntity.setEndDate( sample.getEndDate() );
        companyEntity.setInformation( sample.getInformation() );
        companyEntity.setName( sample.getName() );
        companyEntity.setOutlineText( sample.getOutlineText() );
        companyEntity.setStartDate( sample.getStartDate() );
        companyEntity.setTelNumber( sample.getTelNumber() );
        companyEntity.setWebsite( sample.getWebsite() );

        return companyEntity;
    }

    @Override
    public CompanyResponse entityToDto(CompanyEntity billingPeriodEntity) {
        if ( billingPeriodEntity == null ) {
            return null;
        }

        CompanyResponse companyResponse = new CompanyResponse();

        companyResponse.setId( billingPeriodEntity.getId() );
        companyResponse.setAddress( billingPeriodEntity.getAddress() );
        companyResponse.setCity( billingPeriodEntity.getCity() );
        companyResponse.setCountry( billingPeriodEntity.getCountry() );
        companyResponse.setCreated( billingPeriodEntity.getCreated() );
        companyResponse.setCreatedBy( billingPeriodEntity.getCreatedBy() );
        companyResponse.setEmail( billingPeriodEntity.getEmail() );
        companyResponse.setEndDate( billingPeriodEntity.getEndDate() );
        companyResponse.setInformation( billingPeriodEntity.getInformation() );
        companyResponse.setModified( billingPeriodEntity.getModified() );
        companyResponse.setModifiedBy( billingPeriodEntity.getModifiedBy() );
        companyResponse.setName( billingPeriodEntity.getName() );
        companyResponse.setOutlineText( billingPeriodEntity.getOutlineText() );
        companyResponse.setStartDate( billingPeriodEntity.getStartDate() );
        companyResponse.setTelNumber( billingPeriodEntity.getTelNumber() );
        companyResponse.setWebsite( billingPeriodEntity.getWebsite() );

        return companyResponse;
    }
}
