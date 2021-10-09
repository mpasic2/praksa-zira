package ba.com.zira.praksa.mapper;

import ba.com.zira.praksa.api.model.formula.FormulaCreateRequest;
import ba.com.zira.praksa.api.model.formula.FormulaResponse;
import ba.com.zira.praksa.api.model.formula.FormulaUpdateRequest;
import ba.com.zira.praksa.dao.model.ReviewFormulaEntity;
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
public class FormulaMapperImpl implements FormulaMapper {

    @Override
    public FormulaResponse entityToResponse(ReviewFormulaEntity formulaEntity) {
        if ( formulaEntity == null ) {
            return null;
        }

        FormulaResponse formulaResponse = new FormulaResponse();

        formulaResponse.setId( formulaEntity.getId() );
        formulaResponse.setName( formulaEntity.getName() );
        formulaResponse.setFormula( formulaEntity.getFormula() );

        return formulaResponse;
    }

    @Override
    public ReviewFormulaEntity updateRequestToEntity(FormulaUpdateRequest formulaUpdateRequest, ReviewFormulaEntity formulaEntity) {
        if ( formulaUpdateRequest == null ) {
            return null;
        }

        formulaEntity.setId( formulaUpdateRequest.getId() );
        formulaEntity.setFormula( formulaUpdateRequest.getFormula() );
        formulaEntity.setName( formulaUpdateRequest.getName() );

        return formulaEntity;
    }

    @Override
    public ReviewFormulaEntity createRequestToEntity(FormulaCreateRequest formulaCreateRequest) {
        if ( formulaCreateRequest == null ) {
            return null;
        }

        ReviewFormulaEntity reviewFormulaEntity = new ReviewFormulaEntity();

        reviewFormulaEntity.setFormula( formulaCreateRequest.getFormula() );
        reviewFormulaEntity.setName( formulaCreateRequest.getName() );

        return reviewFormulaEntity;
    }

    @Override
    public List<FormulaResponse> entityListToResponseList(List<ReviewFormulaEntity> conceptEntities) {
        if ( conceptEntities == null ) {
            return null;
        }

        List<FormulaResponse> list = new ArrayList<FormulaResponse>( conceptEntities.size() );
        for ( ReviewFormulaEntity reviewFormulaEntity : conceptEntities ) {
            list.add( entityToResponse( reviewFormulaEntity ) );
        }

        return list;
    }
}
