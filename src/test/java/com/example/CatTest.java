package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CatTest extends TestsSetUp{

    @Test // самая простая проверка в классе Cat с конструктором feline в объекте cat
    public void testGetSound(){
        Cat cat = new Cat(feline);
        assertEquals("Мяу",cat.getSound());
    }

    @Test // Проверка вызова метода eatMeat() у замокированного объекта Feline
    public void testEatMeatCalled() throws Exception {
        when(mockitorFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(mockitorFeline);
        cat.getFood();
        Mockito.verify(mockitorFeline).eatMeat();
    }

    @Test // Проверка, что метод getFood() возвращает ожидаемый результат
    public void testGetFoodReturnsCorrectValue() throws Exception {
        when(mockitorFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(mockitorFeline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

}
