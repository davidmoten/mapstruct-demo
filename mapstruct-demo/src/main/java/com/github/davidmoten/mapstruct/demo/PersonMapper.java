package com.github.davidmoten.mapstruct.demo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {
    
    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class );

    @Mapping(target = "nickname", source = "alias",)
    Person2 convert(Person1 person);

    @Mapping(target = "alias", source = "nickname")
    Person1 convert(Person2 person);
}