package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CatTest {

    @Test
    public void testGetSound() {
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

   @Test
    public void testGetFood() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(felineMock);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

}