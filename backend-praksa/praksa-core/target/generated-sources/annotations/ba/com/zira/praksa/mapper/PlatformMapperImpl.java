package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.platform.PlatformCreateRequest;
import ba.com.zira.praksa.api.model.platform.PlatformResponse;
import ba.com.zira.praksa.api.model.platform.PlatformUpdateRequest;
import ba.com.zira.praksa.dao.model.PlatformEntity;
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
public class PlatformMapperImpl implements PlatformMapper {

    @Override
    public void updateForPlatformUpdate(PlatformUpdateRequest request, PlatformEntity platformEntity) {
        if ( request == null ) {
            return;
        }

        platformEntity.setId( request.getId() );
        platformEntity.setAbbriviation( request.getAbbriviation() );
        platformEntity.setCode( request.getCode() );
        platformEntity.setFullName( request.getFullName() );
        platformEntity.setInformation( request.getInformation() );
        platformEntity.setModified( request.getModified() );
        platformEntity.setModifiedBy( request.getModifiedBy() );
        platformEntity.setOutlineText( request.getOutlineText() );
    }

    @Override
    public PlatformEntity dtoToEntity(PlatformCreateRequest request) {
        if ( request == null ) {
            return null;
        }

        PlatformEntity platformEntity = new PlatformEntity();

        platformEntity.setAbbriviation( request.getAbbriviation() );
        platformEntity.setCode( request.getCode() );
        platformEntity.setCreated( request.getCreated() );
        platformEntity.setCreatedBy( request.getCreatedBy() );
        platformEntity.setFullName( request.getFullName() );
        platformEntity.setInformation( request.getInformation() );
        platformEntity.setOutlineText( request.getOutlineText() );

        return platformEntity;
    }

    @Override
    public PlatformResponse entityToDto(PlatformEntity platformEntity) {
        if ( platformEntity == null ) {
            return null;
        }

        PlatformResponse platformResponse = new PlatformResponse();

        platformResponse.setId( platformEntity.getId() );
        platformResponse.setAbbriviation( platformEntity.getAbbriviation() );
        platformResponse.setCode( platformEntity.getCode() );
        platformResponse.setCreated( platformEntity.getCreated() );
        platformResponse.setCreatedBy( platformEntity.getCreatedBy() );
        platformResponse.setFullName( platformEntity.getFullName() );
        platformResponse.setInformation( platformEntity.getInformation() );
        platformResponse.setModified( platformEntity.getModified() );
        platformResponse.setModifiedBy( platformEntity.getModifiedBy() );
        platformResponse.setOutlineText( platformEntity.getOutlineText() );

        return platformResponse;
    }

    @Override
    public List<PlatformResponse> entityListToDtoList(List<PlatformEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PlatformResponse> list = new ArrayList<PlatformResponse>( entityList.size() );
        for ( PlatformEntity platformEntity : entityList ) {
            list.add( entityToDto( platformEntity ) );
        }

        return list;
    }
}
