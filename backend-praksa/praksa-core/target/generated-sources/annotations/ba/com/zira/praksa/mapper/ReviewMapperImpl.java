package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.review.ReviewCreateRequest;
import ba.com.zira.praksa.api.model.review.ReviewResponse;
import ba.com.zira.praksa.api.model.review.ReviewSearchRequest;
import ba.com.zira.praksa.api.model.review.ReviewUpdateRequest;
import ba.com.zira.praksa.dao.model.GameEntity;
import ba.com.zira.praksa.dao.model.ReviewEntity;
import ba.com.zira.praksa.dao.model.ReviewFormulaEntity;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-07-29T23:59:13+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public ReviewResponse reviewEntityToReview(ReviewEntity reviewEntity) {
        if ( reviewEntity == null ) {
            return null;
        }

        ReviewResponse reviewResponse = new ReviewResponse();

        reviewResponse.setGameId( reviewEntityGameId( reviewEntity ) );
        reviewResponse.setFormulaId( reviewEntityReviewFormulaId( reviewEntity ) );
        reviewResponse.setId( reviewEntity.getId() );
        reviewResponse.setTitle( reviewEntity.getTitle() );
        reviewResponse.setText( reviewEntity.getText() );

        return reviewResponse;
    }

    @Override
    public ReviewEntity reviewToReviewEntity(ReviewSearchRequest review) {
        if ( review == null ) {
            return null;
        }

        ReviewEntity reviewEntity = new ReviewEntity();

        return reviewEntity;
    }

    @Override
    public ReviewEntity createRequestToEntity(ReviewCreateRequest entity) {
        if ( entity == null ) {
            return null;
        }

        ReviewEntity reviewEntity = new ReviewEntity();

        reviewEntity.setText( entity.getText() );
        reviewEntity.setTitle( entity.getTitle() );

        return reviewEntity;
    }

    @Override
    public ReviewEntity updateRequestToEntity(ReviewUpdateRequest reviewRequest, ReviewEntity reviewEntity) {
        if ( reviewRequest == null ) {
            return null;
        }

        reviewEntity.setId( reviewRequest.getId() );
        reviewEntity.setText( reviewRequest.getText() );
        reviewEntity.setTitle( reviewRequest.getTitle() );

        return reviewEntity;
    }

    private Long reviewEntityGameId(ReviewEntity reviewEntity) {
        if ( reviewEntity == null ) {
            return null;
        }
        GameEntity game = reviewEntity.getGame();
        if ( game == null ) {
            return null;
        }
        Long id = game.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long reviewEntityReviewFormulaId(ReviewEntity reviewEntity) {
        if ( reviewEntity == null ) {
            return null;
        }
        ReviewFormulaEntity reviewFormula = reviewEntity.getReviewFormula();
        if ( reviewFormula == null ) {
            return null;
        }
        Long id = reviewFormula.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
