package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.person.Person;
import ba.com.zira.praksa.api.model.person.PersonCreateRequest;
import ba.com.zira.praksa.api.model.person.PersonUpdateRequest;
import ba.com.zira.praksa.dao.model.PersonEntity;
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
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonEntity personUpdateToPersonEntity(PersonUpdateRequest personUpdateModel) {
        if ( personUpdateModel == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setId( personUpdateModel.getId() );
        personEntity.setAliases( personUpdateModel.getAliases() );
        personEntity.setCity( personUpdateModel.getCity() );
        personEntity.setCountry( personUpdateModel.getCountry() );
        personEntity.setDob( personUpdateModel.getDob() );
        personEntity.setDod( personUpdateModel.getDod() );
        personEntity.setEmail( personUpdateModel.getEmail() );
        personEntity.setFirstName( personUpdateModel.getFirstName() );
        personEntity.setGender( personUpdateModel.getGender() );
        personEntity.setInformation( personUpdateModel.getInformation() );
        personEntity.setLastName( personUpdateModel.getLastName() );
        personEntity.setTwitter( personUpdateModel.getTwitter() );
        personEntity.setWebsite( personUpdateModel.getWebsite() );

        return personEntity;
    }

    @Override
    public PersonUpdateRequest personEntityToPersonUpdate(PersonEntity personEntity) {
        if ( personEntity == null ) {
            return null;
        }

        PersonUpdateRequest personUpdateRequest = new PersonUpdateRequest();

        personUpdateRequest.setId( personEntity.getId() );
        personUpdateRequest.setFirstName( personEntity.getFirstName() );
        personUpdateRequest.setLastName( personEntity.getLastName() );
        personUpdateRequest.setInformation( personEntity.getInformation() );
        personUpdateRequest.setGender( personEntity.getGender() );
        personUpdateRequest.setDob( personEntity.getDob() );
        personUpdateRequest.setDod( personEntity.getDod() );
        personUpdateRequest.setCity( personEntity.getCity() );
        personUpdateRequest.setCountry( personEntity.getCountry() );
        personUpdateRequest.setEmail( personEntity.getEmail() );
        personUpdateRequest.setWebsite( personEntity.getWebsite() );
        personUpdateRequest.setTwitter( personEntity.getTwitter() );
        personUpdateRequest.setAliases( personEntity.getAliases() );

        return personUpdateRequest;
    }

    @Override
    public PersonEntity personCreateToPersonEntity(PersonCreateRequest personCreateModel) {
        if ( personCreateModel == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setAliases( personCreateModel.getAliases() );
        personEntity.setCity( personCreateModel.getCity() );
        personEntity.setCountry( personCreateModel.getCountry() );
        personEntity.setDob( personCreateModel.getDob() );
        personEntity.setDod( personCreateModel.getDod() );
        personEntity.setEmail( personCreateModel.getEmail() );
        personEntity.setFirstName( personCreateModel.getFirstName() );
        personEntity.setGender( personCreateModel.getGender() );
        personEntity.setInformation( personCreateModel.getInformation() );
        personEntity.setLastName( personCreateModel.getLastName() );
        personEntity.setTwitter( personCreateModel.getTwitter() );
        personEntity.setWebsite( personCreateModel.getWebsite() );

        return personEntity;
    }

    @Override
    public PersonCreateRequest personEntityToPersonCreate(PersonEntity personEntity) {
        if ( personEntity == null ) {
            return null;
        }

        PersonCreateRequest personCreateRequest = new PersonCreateRequest();

        personCreateRequest.setFirstName( personEntity.getFirstName() );
        personCreateRequest.setLastName( personEntity.getLastName() );
        personCreateRequest.setInformation( personEntity.getInformation() );
        personCreateRequest.setGender( personEntity.getGender() );
        personCreateRequest.setDob( personEntity.getDob() );
        personCreateRequest.setDod( personEntity.getDod() );
        personCreateRequest.setCity( personEntity.getCity() );
        personCreateRequest.setCountry( personEntity.getCountry() );
        personCreateRequest.setEmail( personEntity.getEmail() );
        personCreateRequest.setWebsite( personEntity.getWebsite() );
        personCreateRequest.setTwitter( personEntity.getTwitter() );
        personCreateRequest.setAliases( personEntity.getAliases() );

        return personCreateRequest;
    }

    @Override
    public PersonEntity dtoToEntity(Person dto) {
        if ( dto == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setId( dto.getId() );
        personEntity.setAliases( dto.getAliases() );
        personEntity.setCity( dto.getCity() );
        personEntity.setCountry( dto.getCountry() );
        personEntity.setCreated( dto.getCreated() );
        personEntity.setCreatedBy( dto.getCreatedBy() );
        personEntity.setDob( dto.getDob() );
        personEntity.setDod( dto.getDod() );
        personEntity.setEmail( dto.getEmail() );
        personEntity.setFirstName( dto.getFirstName() );
        personEntity.setGender( dto.getGender() );
        personEntity.setInformation( dto.getInformation() );
        personEntity.setLastName( dto.getLastName() );
        personEntity.setModified( dto.getModified() );
        personEntity.setModifiedBy( dto.getModifiedBy() );
        personEntity.setTwitter( dto.getTwitter() );
        personEntity.setWebsite( dto.getWebsite() );

        return personEntity;
    }

    @Override
    public Person entityToDto(PersonEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Person person = new Person();

        person.setId( entity.getId() );
        person.setFirstName( entity.getFirstName() );
        person.setLastName( entity.getLastName() );
        person.setInformation( entity.getInformation() );
        person.setGender( entity.getGender() );
        person.setDob( entity.getDob() );
        person.setDod( entity.getDod() );
        person.setCity( entity.getCity() );
        person.setCountry( entity.getCountry() );
        person.setEmail( entity.getEmail() );
        person.setWebsite( entity.getWebsite() );
        person.setTwitter( entity.getTwitter() );
        person.setAliases( entity.getAliases() );
        person.setCreated( entity.getCreated() );
        person.setCreatedBy( entity.getCreatedBy() );
        person.setModified( entity.getModified() );
        person.setModifiedBy( entity.getModifiedBy() );

        return person;
    }

    @Override
    public List<Person> entityListToDtoList(List<PersonEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<Person> list = new ArrayList<Person>( entityList.size() );
        for ( PersonEntity personEntity : entityList ) {
            list.add( entityToDto( personEntity ) );
        }

        return list;
    }
}
