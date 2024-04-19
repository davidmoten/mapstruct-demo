package com.github.davidmoten.mapstruct.demo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.github.davidmoten.mapstruct.other.Person2;

@Mapper
public interface PersonMapper extends MapperBase {
    
    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class );

    @Mapping(target = "nickname", source = "alias", qualifiedByName="fromOptional")
    Person2 convert(Person1 person);

    @Mapping(target = "alias", source = "nickname", qualifiedByName="toOptional")
    Person1 convert(Person2 person);
    
}