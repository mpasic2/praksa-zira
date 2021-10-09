package ba.com.zira.praksa.mapper;

import ba.com.zira.commons.model.PagedData;
import ba.com.zira.praksa.api.model.game.Game;
import ba.com.zira.praksa.api.model.game.GameCreateRequest;
import ba.com.zira.praksa.api.model.game.GameOverviewResponse;
import ba.com.zira.praksa.api.model.game.GameResponse;
import ba.com.zira.praksa.api.model.game.GameUpdateRequest;
import ba.com.zira.praksa.dao.model.GameEntity;
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
public class GameMapperImpl implements GameMapper {

    @Override
    public GameResponse gameEntityToGame(GameEntity gameModelEntity) {
        if ( gameModelEntity == null ) {
            return null;
        }

        GameResponse gameResponse = new GameResponse();

        gameResponse.setFullName( gameModelEntity.getFullName() );
        gameResponse.setId( gameModelEntity.getId() );
        gameResponse.setAbbriviation( gameModelEntity.getAbbriviation() );
        gameResponse.setCreated( gameModelEntity.getCreated() );
        gameResponse.setCreatedBy( gameModelEntity.getCreatedBy() );
        gameResponse.setDlc( gameModelEntity.getDlc() );
        gameResponse.setGenre( gameModelEntity.getGenre() );
        gameResponse.setInformation( gameModelEntity.getInformation() );
        gameResponse.setModified( gameModelEntity.getModified() );
        gameResponse.setModifiedBy( gameModelEntity.getModifiedBy() );
        gameResponse.setOutlineText( gameModelEntity.getOutlineText() );

        return gameResponse;
    }

    @Override
    public GameEntity gameToGameEntity(GameCreateRequest gameModel) {
        if ( gameModel == null ) {
            return null;
        }

        GameEntity gameEntity = new GameEntity();

        gameEntity.setFullName( gameModel.getFullName() );
        gameEntity.setAbbriviation( gameModel.getAbbriviation() );
        gameEntity.setDlc( gameModel.getDlc() );
        gameEntity.setGenre( gameModel.getGenre() );
        gameEntity.setInformation( gameModel.getInformation() );
        gameEntity.setOutlineText( gameModel.getOutlineText() );

        return gameEntity;
    }

    @Override
    public PagedData<Game> entitiesToDtos(PagedData<GameEntity> gameEntities) {
        if ( gameEntities == null ) {
            return null;
        }

        PagedData<Game> pagedData = new PagedData<Game>();

        pagedData.setRecords( gameEntityListToGameList( gameEntities.getRecords() ) );
        pagedData.setRecordsPerPage( gameEntities.getRecordsPerPage() );
        pagedData.setPage( gameEntities.getPage() );
        pagedData.setNumberOfPages( gameEntities.getNumberOfPages() );
        pagedData.setNumberOfRecords( gameEntities.getNumberOfRecords() );

        return pagedData;
    }

    @Override
    public void updateForGameUpdate(GameUpdateRequest gameModel, GameEntity gameEntity) {
        if ( gameModel == null ) {
            return;
        }

        gameEntity.setId( gameModel.getId() );
        gameEntity.setAbbriviation( gameModel.getAbbriviation() );
        gameEntity.setDlc( gameModel.getDlc() );
        gameEntity.setFullName( gameModel.getFullName() );
        gameEntity.setGenre( gameModel.getGenre() );
        gameEntity.setInformation( gameModel.getInformation() );
        gameEntity.setOutlineText( gameModel.getOutlineText() );
    }

    @Override
    public GameEntity responseToEntity(GameResponse gameResponse) {
        if ( gameResponse == null ) {
            return null;
        }

        GameEntity gameEntity = new GameEntity();

        gameEntity.setId( gameResponse.getId() );
        gameEntity.setAbbriviation( gameResponse.getAbbriviation() );
        gameEntity.setCreated( gameResponse.getCreated() );
        gameEntity.setCreatedBy( gameResponse.getCreatedBy() );
        gameEntity.setDlc( gameResponse.getDlc() );
        gameEntity.setFullName( gameResponse.getFullName() );
        gameEntity.setGenre( gameResponse.getGenre() );
        gameEntity.setInformation( gameResponse.getInformation() );
        gameEntity.setModified( gameResponse.getModified() );
        gameEntity.setModifiedBy( gameResponse.getModifiedBy() );
        gameEntity.setOutlineText( gameResponse.getOutlineText() );

        return gameEntity;
    }

    @Override
    public GameEntity dtoToEntity(GameCreateRequest gameRequest) {
        if ( gameRequest == null ) {
            return null;
        }

        GameEntity gameEntity = new GameEntity();

        gameEntity.setAbbriviation( gameRequest.getAbbriviation() );
        gameEntity.setDlc( gameRequest.getDlc() );
        gameEntity.setFullName( gameRequest.getFullName() );
        gameEntity.setGenre( gameRequest.getGenre() );
        gameEntity.setInformation( gameRequest.getInformation() );
        gameEntity.setOutlineText( gameRequest.getOutlineText() );

        return gameEntity;
    }

    @Override
    public Game entityToDto(GameEntity gameEntity) {
        if ( gameEntity == null ) {
            return null;
        }

        Game game = new Game();

        game.setId( gameEntity.getId() );
        game.setAbbriviation( gameEntity.getAbbriviation() );
        game.setCreated( gameEntity.getCreated() );
        game.setCreatedBy( gameEntity.getCreatedBy() );
        game.setDlc( gameEntity.getDlc() );
        game.setFullName( gameEntity.getFullName() );
        game.setGenre( gameEntity.getGenre() );
        game.setInformation( gameEntity.getInformation() );
        game.setModified( gameEntity.getModified() );
        game.setModifiedBy( gameEntity.getModifiedBy() );
        game.setOutlineText( gameEntity.getOutlineText() );

        return game;
    }

    @Override
    public GameOverviewResponse entityToOverviewResponse(GameEntity entity) {
        if ( entity == null ) {
            return null;
        }

        GameOverviewResponse gameOverviewResponse = new GameOverviewResponse();

        gameOverviewResponse.setId( entity.getId() );
        gameOverviewResponse.setAbbriviation( entity.getAbbriviation() );
        gameOverviewResponse.setFullName( entity.getFullName() );
        gameOverviewResponse.setInformation( entity.getInformation() );
        gameOverviewResponse.setOutlineText( entity.getOutlineText() );

        return gameOverviewResponse;
    }

    @Override
    public List<GameResponse> gameEntitesToGames(List<GameEntity> gameEnts) {
        if ( gameEnts == null ) {
            return null;
        }

        List<GameResponse> list = new ArrayList<GameResponse>( gameEnts.size() );
        for ( GameEntity gameEntity : gameEnts ) {
            list.add( gameEntityToGame( gameEntity ) );
        }

        return list;
    }

    @Override
    public List<GameOverviewResponse> entityListToOverviewResponseList(List<GameEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<GameOverviewResponse> list = new ArrayList<GameOverviewResponse>( entityList.size() );
        for ( GameEntity gameEntity : entityList ) {
            list.add( entityToOverviewResponse( gameEntity ) );
        }

        return list;
    }

    protected List<Game> gameEntityListToGameList(List<GameEntity> list) {
        if ( list == null ) {
            return null;
        }

        List<Game> list1 = new ArrayList<Game>( list.size() );
        for ( GameEntity gameEntity : list ) {
            list1.add( entityToDto( gameEntity ) );
        }

        return list1;
    }
}
