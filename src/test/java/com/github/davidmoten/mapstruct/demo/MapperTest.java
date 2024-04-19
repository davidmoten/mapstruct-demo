package com.github.davidmoten.mapstruct.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MapperTest {
    
    @Test
    public void test() {
        Person1 a = new Person1("david", "davo");
        Person2 b = PersonMapper.INSTANCE.convert(a);
        assertEquals(a.getName(), b.getName());
        assertEquals(a.getAlias(), b.getNickname());
    }

}
