package com.github.davidmoten.mapstruct.demo;

public class Person1 {

    private String name;
    private String alias;

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
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAlias(String alias) {
        this.alias = alias;
    }
}
