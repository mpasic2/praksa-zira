package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.character.CharacterCreateRequest;
import ba.com.zira.praksa.api.model.character.CharacterResponse;
import ba.com.zira.praksa.api.model.character.CharacterUpdateRequest;
import ba.com.zira.praksa.api.model.character.CompleteCharacterResponse;
import ba.com.zira.praksa.dao.model.CharacterEntity;
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
public class CharacterMapperImpl implements CharacterMapper {

    @Override
    public List<CharacterResponse> entityListToDtoList(List<CharacterEntity> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CharacterResponse> list = new ArrayList<CharacterResponse>( entityList.size() );
        for ( CharacterEntity characterEntity : entityList ) {
            list.add( characterEntityToCharacterResponse( characterEntity ) );
        }

        return list;
    }

    @Override
    public CompleteCharacterResponse characterEntityToCompleteCharacter(CharacterEntity characterEntity) {
        if ( characterEntity == null ) {
            return null;
        }

        CompleteCharacterResponse completeCharacterResponse = new CompleteCharacterResponse();

        completeCharacterResponse.setId( characterEntity.getId() );
        completeCharacterResponse.setName( characterEntity.getName() );
        completeCharacterResponse.setRealName( characterEntity.getRealName() );
        completeCharacterResponse.setAliases( characterEntity.getAliases() );
        completeCharacterResponse.setGender( characterEntity.getGender() );
        completeCharacterResponse.setDob( characterEntity.getDob() );
        completeCharacterResponse.setDod( characterEntity.getDod() );
        completeCharacterResponse.setOutlineText( characterEntity.getOutlineText() );
        completeCharacterResponse.setInformation( characterEntity.getInformation() );

        return completeCharacterResponse;
    }

    @Override
    public CharacterEntity dtoToEntity(CharacterCreateRequest characterDto) {
        if ( characterDto == null ) {
            return null;
        }

        CharacterEntity characterEntity = new CharacterEntity();

        characterEntity.setAliases( characterDto.getAliases() );
        characterEntity.setGender( characterDto.getGender() );
        characterEntity.setOutlineText( characterDto.getOutlineText() );
        characterEntity.setInformation( characterDto.getInformation() );
        characterEntity.setName( characterDto.getName() );
        characterEntity.setRealName( characterDto.getRealName() );

        return characterEntity;
    }

    @Override
    public void updateDtoToEntity(CharacterUpdateRequest characterDto, CharacterEntity characterEntity) {
        if ( characterDto == null ) {
            return;
        }

        characterEntity.setId( characterDto.getId() );
        characterEntity.setAliases( characterDto.getAliases() );
        characterEntity.setGender( characterDto.getGender() );
        characterEntity.setOutlineText( characterDto.getOutlineText() );
        characterEntity.setInformation( characterDto.getInformation() );
        characterEntity.setName( characterDto.getName() );
        characterEntity.setRealName( characterDto.getRealName() );
    }

    protected CharacterResponse characterEntityToCharacterResponse(CharacterEntity characterEntity) {
        if ( characterEntity == null ) {
            return null;
        }

        CharacterResponse characterResponse = new CharacterResponse();

        characterResponse.setId( characterEntity.getId() );
        characterResponse.setAliases( characterEntity.getAliases() );
        characterResponse.setCreated( characterEntity.getCreated() );
        characterResponse.setCreatedBy( characterEntity.getCreatedBy() );
        characterResponse.setDob( characterEntity.getDob() );
        characterResponse.setDod( characterEntity.getDod() );
        characterResponse.setGender( characterEntity.getGender() );
        characterResponse.setInformation( characterEntity.getInformation() );
        characterResponse.setModified( characterEntity.getModified() );
        characterResponse.setModifiedBy( characterEntity.getModifiedBy() );
        characterResponse.setName( characterEntity.getName() );
        characterResponse.setRealName( characterEntity.getRealName() );

        return characterResponse;
    }
}
