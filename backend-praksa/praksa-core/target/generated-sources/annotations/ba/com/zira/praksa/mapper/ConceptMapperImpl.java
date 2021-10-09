package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.concept.ConceptCreateRequest;
import ba.com.zira.praksa.api.model.concept.ConceptResponse;
import ba.com.zira.praksa.api.model.concept.ConceptUpdateRequest;
import ba.com.zira.praksa.dao.model.ConceptEntity;
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
public class ConceptMapperImpl implements ConceptMapper {

    @Override
    public ConceptEntity responseToEntity(ConceptResponse conceptResponse) {
        if ( conceptResponse == null ) {
            return null;
        }

        ConceptEntity conceptEntity = new ConceptEntity();

        conceptEntity.setId( conceptResponse.getId() );
        conceptEntity.setAliases( conceptResponse.getAliases() );
        conceptEntity.setCreated( conceptResponse.getCreated() );
        conceptEntity.setCreatedBy( conceptResponse.getCreatedBy() );
        conceptEntity.setInformation( conceptResponse.getInformation() );
        conceptEntity.setModified( conceptResponse.getModified() );
        conceptEntity.setModifiedBy( conceptResponse.getModifiedBy() );
        conceptEntity.setName( conceptResponse.getName() );
        conceptEntity.setOutline( conceptResponse.getOutline() );

        return conceptEntity;
    }

    @Override
    public ConceptResponse entityToResponse(ConceptEntity conceptEntity) {
        if ( conceptEntity == null ) {
            return null;
        }

        ConceptResponse conceptResponse = new ConceptResponse();

        conceptResponse.setId( conceptEntity.getId() );
        conceptResponse.setAliases( conceptEntity.getAliases() );
        conceptResponse.setCreated( conceptEntity.getCreated() );
        conceptResponse.setCreatedBy( conceptEntity.getCreatedBy() );
        conceptResponse.setInformation( conceptEntity.getInformation() );
        conceptResponse.setModified( conceptEntity.getModified() );
        conceptResponse.setModifiedBy( conceptEntity.getModifiedBy() );
        conceptResponse.setName( conceptEntity.getName() );
        conceptResponse.setOutline( conceptEntity.getOutline() );

        return conceptResponse;
    }

    @Override
    public ConceptEntity updateRequestToEntity(ConceptUpdateRequest conceptUpdateRequest, ConceptEntity conceptEntity) {
        if ( conceptUpdateRequest == null ) {
            return null;
        }

        conceptEntity.setId( conceptUpdateRequest.getId() );
        conceptEntity.setAliases( conceptUpdateRequest.getAliases() );
        conceptEntity.setInformation( conceptUpdateRequest.getInformation() );
        conceptEntity.setName( conceptUpdateRequest.getName() );
        conceptEntity.setOutline( conceptUpdateRequest.getOutline() );

        return conceptEntity;
    }

    @Override
    public ConceptEntity createRequestToEntity(ConceptCreateRequest conceptCreateRequest) {
        if ( conceptCreateRequest == null ) {
            return null;
        }

        ConceptEntity conceptEntity = new ConceptEntity();

        conceptEntity.setAliases( conceptCreateRequest.getAliases() );
        conceptEntity.setInformation( conceptCreateRequest.getInformation() );
        conceptEntity.setName( conceptCreateRequest.getName() );
        conceptEntity.setOutline( conceptCreateRequest.getOutline() );

        return conceptEntity;
    }

    @Override
    public List<ConceptResponse> entityListToResponseList(List<ConceptEntity> conceptEntityList) {
        if ( conceptEntityList == null ) {
            return null;
        }

        List<ConceptResponse> list = new ArrayList<ConceptResponse>( conceptEntityList.size() );
        for ( ConceptEntity conceptEntity : conceptEntityList ) {
            list.add( entityToResponse( conceptEntity ) );
        }

        return list;
    }
}
