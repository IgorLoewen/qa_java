package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LionTest {

    @Test
    public void testGetKittens() throws Exception {
        AnimalActions animalActionsMock = Mockito.mock(AnimalActions.class);
        when(animalActionsMock.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самец",animalActionsMock);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testSamezTrue() throws Exception{
        AnimalActions animalActionsMock = Mockito.mock(AnimalActions.class);
        Lion lion = new Lion("Самец", animalActionsMock);
        assertEquals(true,lion.doesHaveMane());
    }

    @Test
    public void testSamkaFalse() throws Exception{
        AnimalActions animalActionsMock = Mockito.mock(AnimalActions.class);
        Lion lion = new Lion("Самка",animalActionsMock);
        assertEquals(false,lion.doesHaveMane());
    }

    @Test
    public void testInvalidSexThrowsException() {
        AnimalActions animalActionsMock = Mockito.mock(AnimalActions.class);
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Пох", animalActionsMock);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void testGetFood () throws Exception{
        AnimalActions animalActionsMock = Mockito.mock(AnimalActions.class);
        when(animalActionsMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец",animalActionsMock);
        assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

}
