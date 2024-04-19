package com.github.davidmoten.mapstruct.demo;

import java.util.Optional;

import org.mapstruct.Named;

public interface MapperBase {
    
    @Named("fromOptional")
    default <T> T fromOptional(Optional<T> value) {
        return value.orElse(null);
    }

    @Named("toOptional")
    default <T> Optional<T> toOptional(T value) {
        return Optional.ofNullable(value);
    }

}
