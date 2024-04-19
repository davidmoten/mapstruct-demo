package com.github.davidmoten.mapstruct.demo;

public class Person2 {

    private String name;
    private String nickname;

    public Person2(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
