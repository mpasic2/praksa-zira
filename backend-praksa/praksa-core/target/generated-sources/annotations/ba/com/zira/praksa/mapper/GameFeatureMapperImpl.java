package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.gamefeature.GameFeatureCreateRequest;
import ba.com.zira.praksa.api.model.gamefeature.GameFeatureResponse;
import ba.com.zira.praksa.api.model.gamefeature.GameFeatureUpdateRequest;
import ba.com.zira.praksa.dao.model.GameFeatureEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-29T23:59:13+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class GameFeatureMapperImpl implements GameFeatureMapper {

    @Override
    public GameFeatureResponse entityToDto(GameFeatureEntity gameFeatureDto) {
        if ( gameFeatureDto == null ) {
            return null;
        }

        GameFeatureResponse gameFeatureResponse = new GameFeatureResponse();

        gameFeatureResponse.setUuid( gameFeatureDto.getUuid() );
        gameFeatureResponse.setCreated( gameFeatureDto.getCreated() );
        gameFeatureResponse.setCreatedBy( gameFeatureDto.getCreatedBy() );
        gameFeatureResponse.setModified( gameFeatureDto.getModified() );
        gameFeatureResponse.setModifiedBy( gameFeatureDto.getModifiedBy() );

        return gameFeatureResponse;
    }

    @Override
    public void updateDtoToEntity(GameFeatureUpdateRequest gameFeatureDto, GameFeatureEntity gameFeatureEntity) {
        if ( gameFeatureDto == null ) {
            return;
        }

        gameFeatureEntity.setUuid( gameFeatureDto.getUuid() );
    }

    @Override
    public GameFeatureEntity dtoToEntity(GameFeatureCreateRequest gameFeatureDto) {
        if ( gameFeatureDto == null ) {
            return null;
        }

        GameFeatureEntity gameFeatureEntity = new GameFeatureEntity();

        return gameFeatureEntity;
    }
}
