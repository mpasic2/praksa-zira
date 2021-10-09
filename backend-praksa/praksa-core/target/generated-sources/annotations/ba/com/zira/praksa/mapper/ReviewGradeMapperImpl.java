package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.reviewgrade.ReviewGradeCreateRequest;
import ba.com.zira.praksa.api.model.reviewgrade.ReviewGradeResponse;
import ba.com.zira.praksa.dao.model.ReviewGradeEntity;
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
public class ReviewGradeMapperImpl implements ReviewGradeMapper {

    @Override
    public ReviewGradeEntity reviewGradeCreateRequestToEntity(ReviewGradeCreateRequest createRequest) {
        if ( createRequest == null ) {
            return null;
        }

        ReviewGradeEntity reviewGradeEntity = new ReviewGradeEntity();

        reviewGradeEntity.setGrade( createRequest.getGrade() );
        reviewGradeEntity.setType( createRequest.getType() );

        return reviewGradeEntity;
    }

    @Override
    public ReviewGradeResponse reviewGradeEntityToResponse(ReviewGradeEntity entity) {
        if ( entity == null ) {
            return null;
        }

        ReviewGradeResponse reviewGradeResponse = new ReviewGradeResponse();

        reviewGradeResponse.setGrade( entity.getGrade() );
        reviewGradeResponse.setType( entity.getType() );

        return reviewGradeResponse;
    }

    @Override
    public List<ReviewGradeResponse> reviewGradeEntityListToResponseList(List<ReviewGradeEntity> entity) {
        if ( entity == null ) {
            return null;
        }

        List<ReviewGradeResponse> list = new ArrayList<ReviewGradeResponse>( entity.size() );
        for ( ReviewGradeEntity reviewGradeEntity : entity ) {
            list.add( reviewGradeEntityToResponse( reviewGradeEntity ) );
        }

        return list;
    }

    @Override
    public ReviewGradeResponse reviewGradeCreateRequestToResponse(ReviewGradeCreateRequest createRequest) {
        if ( createRequest == null ) {
            return null;
        }

        ReviewGradeResponse reviewGradeResponse = new ReviewGradeResponse();

        reviewGradeResponse.setGrade( createRequest.getGrade() );
        reviewGradeResponse.setType( createRequest.getType() );

        return reviewGradeResponse;
    }

    @Override
    public List<ReviewGradeResponse> reviewGradeCreateRequestListToResponseList(List<ReviewGradeCreateRequest> createRequest) {
        if ( createRequest == null ) {
            return null;
        }

        List<ReviewGradeResponse> list = new ArrayList<ReviewGradeResponse>( createRequest.size() );
        for ( ReviewGradeCreateRequest reviewGradeCreateRequest : createRequest ) {
            list.add( reviewGradeCreateRequestToResponse( reviewGradeCreateRequest ) );
        }

        return list;
    }

    @Override
    public ReviewGradeEntity reviewGradeResponseToEntity(ReviewGradeResponse response) {
        if ( response == null ) {
            return null;
        }

        ReviewGradeEntity reviewGradeEntity = new ReviewGradeEntity();

        reviewGradeEntity.setGrade( response.getGrade() );
        reviewGradeEntity.setType( response.getType() );

        return reviewGradeEntity;
    }
}
