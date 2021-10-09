package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.location.Location;
import ba.com.zira.praksa.dao.model.LocationEntity;
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
public class LocationMapperImpl implements LocationMapper {

    @Override
    public LocationEntity dtoToEntity(Location sample) {
        if ( sample == null ) {
            return null;
        }

        LocationEntity locationEntity = new LocationEntity();

        locationEntity.setId( sample.getId() );
        locationEntity.setAliases( sample.getAliases() );
        locationEntity.setCreated( sample.getCreated() );
        locationEntity.setCreatedBy( sample.getCreatedBy() );
        locationEntity.setInformation( sample.getInformation() );
        locationEntity.setModified( sample.getModified() );
        locationEntity.setModifiedBy( sample.getModifiedBy() );
        locationEntity.setName( sample.getName() );

        return locationEntity;
    }

    @Override
    public Location entityToDto(LocationEntity billingPeriodEntity) {
        if ( billingPeriodEntity == null ) {
            return null;
        }

        Location location = new Location();

        location.setId( billingPeriodEntity.getId() );
        location.setAliases( billingPeriodEntity.getAliases() );
        location.setCreated( billingPeriodEntity.getCreated() );
        location.setCreatedBy( billingPeriodEntity.getCreatedBy() );
        location.setInformation( billingPeriodEntity.getInformation() );
        location.setModified( billingPeriodEntity.getModified() );
        location.setModifiedBy( billingPeriodEntity.getModifiedBy() );
        location.setName( billingPeriodEntity.getName() );

        return location;
    }

    @Override
    public List<Location> entityListToDtoList(List<LocationEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<Location> list = new ArrayList<Location>( entityList.size() );
        for ( LocationEntity locationEntity : entityList ) {
            list.add( entityToDto( locationEntity ) );
        }

        return list;
    }
}
