package com.atshvrma.config;


import com.atshvrma.dto.SimpleDestinationDto;
import com.atshvrma.dto.SimpleSourceDto;
import org.mapstruct.Mapper;

@Mapper
public interface MapperConfig {

    public SimpleSourceDto destinatioToSourceDto(SimpleDestinationDto destinationDto);

    public  SimpleDestinationDto sourceToDestinationDto(SimpleSourceDto sourceDto);

}
