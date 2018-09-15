package com.atshvrma.tests;

import com.atshvrma.config.MapperConfig;
import com.atshvrma.dto.SimpleDestinationDto;
import com.atshvrma.dto.SimpleSourceDto;
import org.junit.Test;
import org.mapstruct.factory.Mappers;
import  static org.junit.Assert.assertEquals;

public class MapperTests {


    MapperConfig mapper =  Mappers.getMapper(MapperConfig.class);

    @Test
    public void testMappers(){

        SimpleDestinationDto destinationDto = new SimpleDestinationDto();
        destinationDto.setName("Madhur");
        destinationDto.setDescription("Speaks nice");

        SimpleSourceDto source = mapper.destinatioToSourceDto(destinationDto);


        System.out.print("source Name ="+ source.getName());
        System.out.print("source Description ="+ source.getDescription());
        assertEquals(source.getName(), destinationDto.getName());
        assertEquals(source.getDescription(),destinationDto.getDescription());

    }


}
