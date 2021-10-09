package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.linkmap.LinkMapCreate;
import ba.com.zira.praksa.api.model.linkmap.LinkMapResponse;
import ba.com.zira.praksa.api.model.linkmap.LinkMapUpdate;
import ba.com.zira.praksa.dao.model.LinkMapEntity;
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
public class LinkMapMapperImpl implements LinkMapMapper {

    @Override
    public LinkMapEntity dtoToEntity(LinkMapResponse linkMapResopnse) {
        if ( linkMapResopnse == null ) {
            return null;
        }

        LinkMapEntity linkMapEntity = new LinkMapEntity();

        linkMapEntity.setUuid( linkMapResopnse.getUuid() );
        linkMapEntity.setCreated( linkMapResopnse.getCreated() );
        linkMapEntity.setCreatedBy( linkMapResopnse.getCreatedBy() );
        linkMapEntity.setModified( linkMapResopnse.getModified() );
        linkMapEntity.setModifiedBy( linkMapResopnse.getModifiedBy() );

        return linkMapEntity;
    }

    @Override
    public LinkMapResponse entityToDto(LinkMapEntity linkMapEntity) {
        if ( linkMapEntity == null ) {
            return null;
        }

        LinkMapResponse linkMapResponse = new LinkMapResponse();

        linkMapResponse.setUuid( linkMapEntity.getUuid() );
        linkMapResponse.setCreated( linkMapEntity.getCreated() );
        linkMapResponse.setCreatedBy( linkMapEntity.getCreatedBy() );
        linkMapResponse.setModified( linkMapEntity.getModified() );
        linkMapResponse.setModifiedBy( linkMapEntity.getModifiedBy() );

        return linkMapResponse;
    }

    @Override
    public void updateRequestToEntity(LinkMapUpdate conceptUpdateRequest, LinkMapEntity linkMapEntity) {
        if ( conceptUpdateRequest == null ) {
            return;
        }

        linkMapEntity.setUuid( conceptUpdateRequest.getUuid() );
        linkMapEntity.setModified( conceptUpdateRequest.getModified() );
        linkMapEntity.setModifiedBy( conceptUpdateRequest.getModifiedBy() );
    }

    @Override
    public LinkMapEntity createRequestToEntity(LinkMapCreate linkMapCreateRequest) {
        if ( linkMapCreateRequest == null ) {
            return null;
        }

        LinkMapEntity linkMapEntity = new LinkMapEntity();

        linkMapEntity.setUuid( linkMapCreateRequest.getUuid() );
        linkMapEntity.setCreated( linkMapCreateRequest.getCreated() );
        linkMapEntity.setCreatedBy( linkMapCreateRequest.getCreatedBy() );
        linkMapEntity.setModified( linkMapCreateRequest.getModified() );
        linkMapEntity.setModifiedBy( linkMapCreateRequest.getModifiedBy() );

        return linkMapEntity;
    }

    @Override
    public List<LinkMapResponse> entityListToResponseList(List<LinkMapEntity> linkMapEntityList) {
        if ( linkMapEntityList == null ) {
            return null;
        }

        List<LinkMapResponse> list = new ArrayList<LinkMapResponse>( linkMapEntityList.size() );
        for ( LinkMapEntity linkMapEntity : linkMapEntityList ) {
            list.add( entityToDto( linkMapEntity ) );
        }

        return list;
    }
}
