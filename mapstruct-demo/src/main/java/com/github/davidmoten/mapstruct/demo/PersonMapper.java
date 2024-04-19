package com.github.davidmoten.mapstruct.demo;

import java.util.Optional;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import com.github.davidmoten.mapstruct.other.Person2;

@Mapper
public interface PersonMapper {
    
    PersonMapper INSTANCE = Mappers.getMapper( PersonMapper.class );

    @Mapping(target = "nickname", source = "alias", qualifiedByName="fromOptional")
    Person2 convert(Person1 person);

    @Mapping(target = "alias", source = "nickname", qualifiedByName="toOptional")
    Person1 convert(Person2 person);
    
    @Named("fromOptional")
    default <T> T map(Optional<T> value) {
        return value.orElse(null);
    }
    
    @Named("toOptional")
    default <T> Optional<T> map(T value) {
        return Optional.ofNullable(value);
    }
}