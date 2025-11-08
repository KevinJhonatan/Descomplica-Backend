package com.direitodescomplicado.web.service.mapper;

import com.direitodescomplicado.web.domain.TrabalhoCLT;
import com.direitodescomplicado.web.service.dto.TrabalhoCLTDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-08T13:31:14+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.7 (Microsoft)"
)
@Component
public class TrabalhoCLTMapperImpl implements TrabalhoCLTMapper {

    @Override
    public TrabalhoCLT toEntity(TrabalhoCLTDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrabalhoCLT trabalhoCLT = new TrabalhoCLT();

        trabalhoCLT.setId( dto.getId() );

        return trabalhoCLT;
    }

    @Override
    public TrabalhoCLTDTO toDto(TrabalhoCLT entity) {
        if ( entity == null ) {
            return null;
        }

        TrabalhoCLTDTO trabalhoCLTDTO = new TrabalhoCLTDTO();

        trabalhoCLTDTO.setId( entity.getId() );

        return trabalhoCLTDTO;
    }

    @Override
    public List<TrabalhoCLT> toEntity(List<TrabalhoCLTDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrabalhoCLT> list = new ArrayList<TrabalhoCLT>( dtoList.size() );
        for ( TrabalhoCLTDTO trabalhoCLTDTO : dtoList ) {
            list.add( toEntity( trabalhoCLTDTO ) );
        }

        return list;
    }

    @Override
    public List<TrabalhoCLTDTO> toDto(List<TrabalhoCLT> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrabalhoCLTDTO> list = new ArrayList<TrabalhoCLTDTO>( entityList.size() );
        for ( TrabalhoCLT trabalhoCLT : entityList ) {
            list.add( toDto( trabalhoCLT ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(TrabalhoCLT entity, TrabalhoCLTDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
    }
}
