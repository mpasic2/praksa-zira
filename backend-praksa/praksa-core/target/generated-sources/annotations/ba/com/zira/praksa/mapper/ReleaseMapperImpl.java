package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.company.CompanyResponse;
import ba.com.zira.praksa.api.model.game.GameResponse;
import ba.com.zira.praksa.api.model.platform.PlatformResponse;
import ba.com.zira.praksa.api.model.region.RegionResponse;
import ba.com.zira.praksa.api.model.release.ReleaseRequest;
import ba.com.zira.praksa.api.model.release.ReleaseResponse;
import ba.com.zira.praksa.api.model.release.ReleaseResponseDetails;
import ba.com.zira.praksa.api.model.release.ReleaseResponseLight;
import ba.com.zira.praksa.dao.model.CompanyEntity;
import ba.com.zira.praksa.dao.model.GameEntity;
import ba.com.zira.praksa.dao.model.PlatformEntity;
import ba.com.zira.praksa.dao.model.RegionEntity;
import ba.com.zira.praksa.dao.model.ReleaseEntity;
import java.time.LocalDateTime;
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
public class ReleaseMapperImpl implements ReleaseMapper {

    @Override
    public ReleaseResponseLight releaseEntityToRelease(ReleaseEntity sampleModelEntity) {
        if ( sampleModelEntity == null ) {
            return null;
        }

        ReleaseResponseLight releaseResponseLight = new ReleaseResponseLight();

        releaseResponseLight.setType( sampleModelEntity.getType() );
        releaseResponseLight.setUuid( sampleModelEntity.getUuid() );
        releaseResponseLight.setCreated( sampleModelEntity.getCreated() );
        releaseResponseLight.setCreatedBy( sampleModelEntity.getCreatedBy() );
        releaseResponseLight.setModified( sampleModelEntity.getModified() );
        releaseResponseLight.setModifiedBy( sampleModelEntity.getModifiedBy() );
        releaseResponseLight.setReleaseDate( sampleModelEntity.getReleaseDate() );

        return releaseResponseLight;
    }

    @Override
    public ReleaseResponse releaseEntityToResponse(ReleaseEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ReleaseResponse releaseResponse = new ReleaseResponse();

        releaseResponse.setUuid( entity.getUuid() );
        releaseResponse.setCreated( entity.getCreated() );
        releaseResponse.setCreatedBy( entity.getCreatedBy() );
        releaseResponse.setModified( entity.getModified() );
        releaseResponse.setModifiedBy( entity.getModifiedBy() );
        releaseResponse.setReleaseDate( entity.getReleaseDate() );
        releaseResponse.setType( entity.getType() );
        releaseResponse.setDeveloper( companyEntityToCompanyResponse( entity.getDeveloper() ) );
        releaseResponse.setPublisher( companyEntityToCompanyResponse( entity.getPublisher() ) );
        releaseResponse.setGame( gameEntityToGameResponse( entity.getGame() ) );
        releaseResponse.setPlatform( platformEntityToPlatformResponse( entity.getPlatform() ) );
        releaseResponse.setRegion( regionEntityToRegionResponse( entity.getRegion() ) );

        return releaseResponse;
    }

    @Override
    public ReleaseResponseDetails entityToDetail(ReleaseEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ReleaseResponseDetails releaseResponseDetails = new ReleaseResponseDetails();

        releaseResponseDetails.setGameId( entityGameId( entity ) );
        releaseResponseDetails.setPublisherId( entityPublisherId( entity ) );
        releaseResponseDetails.setDeveloperId( entityDeveloperId( entity ) );
        releaseResponseDetails.setGameName( entityGameFullName( entity ) );
        releaseResponseDetails.setRegionId( entityRegionId( entity ) );
        releaseResponseDetails.setPublisherName( entityPublisherName( entity ) );
        releaseResponseDetails.setRegionName( entityRegionName( entity ) );
        releaseResponseDetails.setPlatformId( entityPlatformId( entity ) );
        releaseResponseDetails.setPlatformName( entityPlatformFullName( entity ) );
        releaseResponseDetails.setDeveloperName( entityDeveloperName( entity ) );
        releaseResponseDetails.setUuid( entity.getUuid() );
        releaseResponseDetails.setReleaseDate( entity.getReleaseDate() );
        releaseResponseDetails.setType( entity.getType() );

        return releaseResponseDetails;
    }

    @Override
    public ReleaseEntity releaseToReleaseEntity(ReleaseRequest sampleModel) {
        if ( sampleModel == null ) {
            return null;
        }

        ReleaseEntity releaseEntity = new ReleaseEntity();

        releaseEntity.setType( sampleModel.getType() );
        if ( sampleModel.getReleaseDate() != null ) {
            releaseEntity.setReleaseDate( LocalDateTime.parse( sampleModel.getReleaseDate() ) );
        }

        return releaseEntity;
    }

    @Override
    public void updateForReleaseUpdate(ReleaseRequest releaseModel, ReleaseEntity releaseEntity) {
        if ( releaseModel == null ) {
            return;
        }

        if ( releaseModel.getReleaseDate() != null ) {
            releaseEntity.setReleaseDate( LocalDateTime.parse( releaseModel.getReleaseDate() ) );
        }
        else {
            releaseEntity.setReleaseDate( null );
        }
        releaseEntity.setType( releaseModel.getType() );
    }

    @Override
    public ReleaseEntity dtoToEntity(ReleaseRequest sample) {
        if ( sample == null ) {
            return null;
        }

        ReleaseEntity releaseEntity = new ReleaseEntity();

        if ( sample.getReleaseDate() != null ) {
            releaseEntity.setReleaseDate( LocalDateTime.parse( sample.getReleaseDate() ) );
        }
        releaseEntity.setType( sample.getType() );

        return releaseEntity;
    }

    @Override
    public List<ReleaseResponseDetails> entityListToDtoList(List<ReleaseEntity> sampleList) {
        if ( sampleList == null ) {
            return null;
        }

        List<ReleaseResponseDetails> list = new ArrayList<ReleaseResponseDetails>( sampleList.size() );
        for ( ReleaseEntity releaseEntity : sampleList ) {
            list.add( entityToDetail( releaseEntity ) );
        }

        return list;
    }

    @Override
    public List<ReleaseResponse> entityListToResponseList(List<ReleaseEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ReleaseResponse> list = new ArrayList<ReleaseResponse>( entityList.size() );
        for ( ReleaseEntity releaseEntity : entityList ) {
            list.add( releaseEntityToResponse( releaseEntity ) );
        }

        return list;
    }

    @Override
    public List<ReleaseResponse> entitiesToDtos(List<ReleaseEntity> rEntities) {
        if ( rEntities == null ) {
            return null;
        }

        List<ReleaseResponse> list = new ArrayList<ReleaseResponse>( rEntities.size() );
        for ( ReleaseEntity releaseEntity : rEntities ) {
            list.add( releaseEntityToResponse( releaseEntity ) );
        }

        return list;
    }

    protected CompanyResponse companyEntityToCompanyResponse(CompanyEntity companyEntity) {
        if ( companyEntity == null ) {
            return null;
        }

        CompanyResponse companyResponse = new CompanyResponse();

        companyResponse.setId( companyEntity.getId() );
        companyResponse.setAddress( companyEntity.getAddress() );
        companyResponse.setCity( companyEntity.getCity() );
        companyResponse.setCountry( companyEntity.getCountry() );
        companyResponse.setCreated( companyEntity.getCreated() );
        companyResponse.setCreatedBy( companyEntity.getCreatedBy() );
        companyResponse.setEmail( companyEntity.getEmail() );
        companyResponse.setEndDate( companyEntity.getEndDate() );
        companyResponse.setInformation( companyEntity.getInformation() );
        companyResponse.setModified( companyEntity.getModified() );
        companyResponse.setModifiedBy( companyEntity.getModifiedBy() );
        companyResponse.setName( companyEntity.getName() );
        companyResponse.setOutlineText( companyEntity.getOutlineText() );
        companyResponse.setStartDate( companyEntity.getStartDate() );
        companyResponse.setTelNumber( companyEntity.getTelNumber() );
        companyResponse.setWebsite( companyEntity.getWebsite() );

        return companyResponse;
    }

    protected GameResponse gameEntityToGameResponse(GameEntity gameEntity) {
        if ( gameEntity == null ) {
            return null;
        }

        GameResponse gameResponse = new GameResponse();

        gameResponse.setId( gameEntity.getId() );
        gameResponse.setAbbriviation( gameEntity.getAbbriviation() );
        gameResponse.setCreated( gameEntity.getCreated() );
        gameResponse.setCreatedBy( gameEntity.getCreatedBy() );
        gameResponse.setDlc( gameEntity.getDlc() );
        gameResponse.setFullName( gameEntity.getFullName() );
        gameResponse.setGenre( gameEntity.getGenre() );
        gameResponse.setInformation( gameEntity.getInformation() );
        gameResponse.setModified( gameEntity.getModified() );
        gameResponse.setModifiedBy( gameEntity.getModifiedBy() );
        gameResponse.setOutlineText( gameEntity.getOutlineText() );

        return gameResponse;
    }

    protected PlatformResponse platformEntityToPlatformResponse(PlatformEntity platformEntity) {
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

    protected RegionResponse regionEntityToRegionResponse(RegionEntity regionEntity) {
        if ( regionEntity == null ) {
            return null;
        }

        RegionResponse regionResponse = new RegionResponse();

        regionResponse.setCreated( regionEntity.getCreated() );
        regionResponse.setCreatedBy( regionEntity.getCreatedBy() );
        regionResponse.setModified( regionEntity.getModified() );
        regionResponse.setModifiedBy( regionEntity.getModifiedBy() );
        regionResponse.setDescription( regionEntity.getDescription() );
        regionResponse.setName( regionEntity.getName() );

        return regionResponse;
    }

    private Long entityGameId(ReleaseEntity releaseEntity) {
        if ( releaseEntity == null ) {
            return null;
        }
        GameEntity game = releaseEntity.getGame();
        if ( game == null ) {
            return null;
        }
        Long id = game.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityPublisherId(ReleaseEntity releaseEntity) {
        if ( releaseEntity == null ) {
            return null;
        }
        CompanyEntity publisher = releaseEntity.getPublisher();
        if ( publisher == null ) {
            return null;
        }
        Long id = publisher.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long entityDeveloperId(ReleaseEntity releaseEntity) {
        if ( releaseEntity == null ) {
            return null;
        }
        CompanyEntity developer = releaseEntity.getDeveloper();
        if ( developer == null ) {
            return null;
        }
        Long id = developer.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String entityGameFullName(ReleaseEntity releaseEntity) {
        if ( releaseEntity == null ) {
            return null;
        }
        GameEntity game = releaseEntity.getGame();
        if ( game == null ) {
            return null;
        }
        String fullName = game.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private Long entityRegionId(ReleaseEntity releaseEntity) {
        if ( releaseEntity == null ) {
            return null;
        }
        RegionEntity region = releaseEntity.getRegion();
        if ( region == null ) {
            return null;
        }
        Long id = region.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String entityPublisherName(ReleaseEntity releaseEntity) {
        if ( releaseEntity == null ) {
            return null;
        }
        CompanyEntity publisher = releaseEntity.getPublisher();
        if ( publisher == null ) {
            return null;
        }
        String name = publisher.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String entityRegionName(ReleaseEntity releaseEntity) {
        if ( releaseEntity == null ) {
            return null;
        }
        RegionEntity region = releaseEntity.getRegion();
        if ( region == null ) {
            return null;
        }
        String name = region.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long entityPlatformId(ReleaseEntity releaseEntity) {
        if ( releaseEntity == null ) {
            return null;
        }
        PlatformEntity platform = releaseEntity.getPlatform();
        if ( platform == null ) {
            return null;
        }
        Long id = platform.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String entityPlatformFullName(ReleaseEntity releaseEntity) {
        if ( releaseEntity == null ) {
            return null;
        }
        PlatformEntity platform = releaseEntity.getPlatform();
        if ( platform == null ) {
            return null;
        }
        String fullName = platform.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }

    private String entityDeveloperName(ReleaseEntity releaseEntity) {
        if ( releaseEntity == null ) {
            return null;
        }
        CompanyEntity developer = releaseEntity.getDeveloper();
        if ( developer == null ) {
            return null;
        }
        String name = developer.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
