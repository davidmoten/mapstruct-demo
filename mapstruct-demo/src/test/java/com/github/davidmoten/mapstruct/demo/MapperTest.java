package com.github.davidmoten.mapstruct.demo;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;

import com.github.davidmoten.mapstruct.other.Person2;

public class MapperTest {
    
    @Test
    public void testPerson1ToPerson2() {
        Person1 a = new Person1("david", Optional.of("davo"));
        Person2 b = PersonMapper.INSTANCE.convert(a);
        assertEquals(a.name(), b.getName());
        assertEquals(a.alias().get(), b.getNickname());
    }
    
    @Test
    public void testPerson2ToPerson1() {
        Person2 a = new Person2("david", "davo");
        Person1 b = PersonMapper.INSTANCE.convert(a);
        assertEquals(a.getName(), b.name());
        assertEquals(a.getNickname(), b.alias().get());
    }

}
