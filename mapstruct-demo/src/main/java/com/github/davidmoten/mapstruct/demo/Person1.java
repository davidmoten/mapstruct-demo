package com.github.davidmoten.mapstruct.demo;

import java.util.Optional;

public class Person1 {

    private String name;
    private Optional<String> alias;

    public Person1(String name, Optional<String> alias) {
        this.name = name;
        this.alias = alias;
    }

    public String name() {
        return name;
    }

    public Optional<String> alias() {
        return alias;
    }
    
    public Person1 withName(String name) {
        this.name = name;
        return this;
    }
    
    public Person1 withAlias(Optional<String> alias) {
        this.alias = alias;
        return this;
    }
    
    public Person1 withAlias(String alias) {
        this.alias = Optional.of(alias);
        return this;
    }
    
    
}
