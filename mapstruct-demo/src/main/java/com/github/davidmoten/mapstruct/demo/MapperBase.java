package com.github.davidmoten.mapstruct.demo;

import java.util.Optional;

import org.mapstruct.Named;

public interface MapperBase {
    
    @Named("fromOptional")
    default <T> T map(Optional<T> value) {
        return value.orElse(null);
    }

    @Named("toOptional")
    default <T> Optional<T> map(T value) {
        return Optional.ofNullable(value);
    }
}
