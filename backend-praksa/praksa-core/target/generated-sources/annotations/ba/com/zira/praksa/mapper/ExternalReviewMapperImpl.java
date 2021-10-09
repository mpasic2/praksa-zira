package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.externalreview.ExternalReview;
import ba.com.zira.praksa.api.model.externalreview.ExternalReviewCreateRequest;
import ba.com.zira.praksa.api.model.externalreview.ExternalReviewUpdateRequest;
import ba.com.zira.praksa.api.model.rssfeed.RssFeed;
import ba.com.zira.praksa.dao.model.ExternalReviewEntity;
import ba.com.zira.praksa.dao.model.RssFeedEntity;
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
public class ExternalReviewMapperImpl implements ExternalReviewMapper {

    @Override
    public ExternalReviewEntity dtoToEntity(ExternalReview sample) {
        if ( sample == null ) {
            return null;
        }

        ExternalReviewEntity externalReviewEntity = new ExternalReviewEntity();

        externalReviewEntity.setId( sample.getId() );
        externalReviewEntity.setCreated( sample.getCreated() );
        externalReviewEntity.setCreatedBy( sample.getCreatedBy() );
        externalReviewEntity.setInformation( sample.getInformation() );
        externalReviewEntity.setOrigin( sample.getOrigin() );
        externalReviewEntity.setRssFeed( rssFeedToRssFeedEntity( sample.getRssFeed() ) );

        return externalReviewEntity;
    }

    @Override
    public ExternalReview entityToDto(ExternalReviewEntity externalReviewEntity) {
        if ( externalReviewEntity == null ) {
            return null;
        }

        ExternalReview externalReview = new ExternalReview();

        externalReview.setId( externalReviewEntity.getId() );
        externalReview.setCreated( externalReviewEntity.getCreated() );
        externalReview.setCreatedBy( externalReviewEntity.getCreatedBy() );
        externalReview.setInformation( externalReviewEntity.getInformation() );
        externalReview.setOrigin( externalReviewEntity.getOrigin() );
        externalReview.setRssFeed( rssFeedEntityToRssFeed( externalReviewEntity.getRssFeed() ) );

        return externalReview;
    }

    @Override
    public ExternalReviewEntity updateRequestToEntity(ExternalReviewUpdateRequest externalReviewUpdateRequest, ExternalReviewEntity externalReviewEntity) {
        if ( externalReviewUpdateRequest == null ) {
            return null;
        }

        externalReviewEntity.setId( externalReviewUpdateRequest.getId() );
        externalReviewEntity.setInformation( externalReviewUpdateRequest.getInformation() );
        externalReviewEntity.setOrigin( externalReviewUpdateRequest.getOrigin() );

        return externalReviewEntity;
    }

    @Override
    public ExternalReviewEntity createRequestToEntity(ExternalReviewCreateRequest conceptCreateRequest) {
        if ( conceptCreateRequest == null ) {
            return null;
        }

        ExternalReviewEntity externalReviewEntity = new ExternalReviewEntity();

        externalReviewEntity.setInformation( conceptCreateRequest.getInformation() );
        externalReviewEntity.setOrigin( conceptCreateRequest.getOrigin() );

        return externalReviewEntity;
    }

    @Override
    public List<ExternalReview> entityListToExternalReviewList(List<ExternalReviewEntity> externalReviewEntityList) {
        if ( externalReviewEntityList == null ) {
            return null;
        }

        List<ExternalReview> list = new ArrayList<ExternalReview>( externalReviewEntityList.size() );
        for ( ExternalReviewEntity externalReviewEntity : externalReviewEntityList ) {
            list.add( entityToDto( externalReviewEntity ) );
        }

        return list;
    }

    protected List<ExternalReviewEntity> externalReviewListToExternalReviewEntityList(List<ExternalReview> list) {
        if ( list == null ) {
            return null;
        }

        List<ExternalReviewEntity> list1 = new ArrayList<ExternalReviewEntity>( list.size() );
        for ( ExternalReview externalReview : list ) {
            list1.add( dtoToEntity( externalReview ) );
        }

        return list1;
    }

    protected RssFeedEntity rssFeedToRssFeedEntity(RssFeed rssFeed) {
        if ( rssFeed == null ) {
            return null;
        }

        RssFeedEntity rssFeedEntity = new RssFeedEntity();

        rssFeedEntity.setId( rssFeed.getId() );
        rssFeedEntity.setName( rssFeed.getName() );
        rssFeedEntity.setAdapter( rssFeed.getAdapter() );
        rssFeedEntity.setUrl( rssFeed.getUrl() );
        rssFeedEntity.setExternalReviews( externalReviewListToExternalReviewEntityList( rssFeed.getExternalReviews() ) );

        return rssFeedEntity;
    }

    protected RssFeed rssFeedEntityToRssFeed(RssFeedEntity rssFeedEntity) {
        if ( rssFeedEntity == null ) {
            return null;
        }

        RssFeed rssFeed = new RssFeed();

        rssFeed.setId( rssFeedEntity.getId() );
        rssFeed.setName( rssFeedEntity.getName() );
        rssFeed.setUrl( rssFeedEntity.getUrl() );
        rssFeed.setAdapter( rssFeedEntity.getAdapter() );
        rssFeed.setExternalReviews( entityListToExternalReviewList( rssFeedEntity.getExternalReviews() ) );

        return rssFeed;
    }
}
