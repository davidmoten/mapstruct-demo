package com.github.davidmoten.mapstruct.demo;

public class Person1 {

    private final String name;
    private final String alias;

    public Person1(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }
    
}
