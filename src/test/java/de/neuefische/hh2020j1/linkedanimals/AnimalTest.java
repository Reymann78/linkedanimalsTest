package de.neuefische.hh2020j1.linkedanimals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testToString(){
        Animal value = new Animal("Capibara");

        String actual = value.toString();

        assertEquals("Capibara", actual);
    }

}