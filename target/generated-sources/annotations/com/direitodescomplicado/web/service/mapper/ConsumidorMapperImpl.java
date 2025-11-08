package com.direitodescomplicado.web.service.mapper;

import com.direitodescomplicado.web.domain.Consumidor;
import com.direitodescomplicado.web.service.dto.ConsumidorDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-11-08T13:31:13+0000",
    comments = "version: 1.6.3, compiler: javac, environment: Java 21.0.7 (Microsoft)"
)
@Component
public class ConsumidorMapperImpl implements ConsumidorMapper {

    @Override
    public Consumidor toEntity(ConsumidorDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Consumidor consumidor = new Consumidor();

        consumidor.setId( dto.getId() );

        return consumidor;
    }

    @Override
    public ConsumidorDTO toDto(Consumidor entity) {
        if ( entity == null ) {
            return null;
        }

        ConsumidorDTO consumidorDTO = new ConsumidorDTO();

        consumidorDTO.setId( entity.getId() );

        return consumidorDTO;
    }

    @Override
    public List<Consumidor> toEntity(List<ConsumidorDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Consumidor> list = new ArrayList<Consumidor>( dtoList.size() );
        for ( ConsumidorDTO consumidorDTO : dtoList ) {
            list.add( toEntity( consumidorDTO ) );
        }

        return list;
    }

    @Override
    public List<ConsumidorDTO> toDto(List<Consumidor> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ConsumidorDTO> list = new ArrayList<ConsumidorDTO>( entityList.size() );
        for ( Consumidor consumidor : entityList ) {
            list.add( toDto( consumidor ) );
        }

        return list;
    }

    @Override
    public void partialUpdate(Consumidor entity, ConsumidorDTO dto) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getId() != null ) {
            entity.setId( dto.getId() );
        }
    }
}
