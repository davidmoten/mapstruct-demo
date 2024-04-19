package com.github.davidmoten.mapstruct.demo;

public class Person1 {

    private String name;
    private String alias;

    public Person1(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }

    public String name() {
        return name;
    }

    public String alias() {
        return alias;
    }
    
    public Person1 withName(String name) {
        this.name = name;
        return this;
    }
    
    public Person1 withAlias(String alias) {
        this.alias = alias;
        return this;
    }
    
}
