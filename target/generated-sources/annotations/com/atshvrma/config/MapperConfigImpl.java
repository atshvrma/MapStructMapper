package com.atshvrma.config;

import com.atshvrma.dto.SimpleDestinationDto;

import com.atshvrma.dto.SimpleSourceDto;

import javax.annotation.Generated;

@Generated(

    value = "org.mapstruct.ap.MappingProcessor",

    date = "2018-09-15T14:30:06+0530",

    comments = "version: 1.1.0.Final, compiler: javac, environment: Java 1.8.0_181 (Oracle Corporation)"

)

public class MapperConfigImpl implements MapperConfig {

    @Override

    public SimpleSourceDto destinatioToSourceDto(SimpleDestinationDto destinationDto) {

        if ( destinationDto == null ) {

            return null;
        }

        SimpleSourceDto simpleSourceDto = new SimpleSourceDto();

        simpleSourceDto.setName( destinationDto.getName() );

        simpleSourceDto.setDescription( destinationDto.getDescription() );

        return simpleSourceDto;
    }

    @Override

    public SimpleDestinationDto sourceToDestinationDto(SimpleSourceDto sourceDto) {

        if ( sourceDto == null ) {

            return null;
        }

        SimpleDestinationDto simpleDestinationDto = new SimpleDestinationDto();

        simpleDestinationDto.setName( sourceDto.getName() );

        simpleDestinationDto.setDescription( sourceDto.getDescription() );

        return simpleDestinationDto;
    }
}

