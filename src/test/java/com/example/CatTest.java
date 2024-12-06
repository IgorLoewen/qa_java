package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CatTest extends TestsSetUp{

    @Test // самая простая проверка в классе Cat с конструктором feline в объекте cat
    public void testGetSound(){
        Cat cat = new Cat(feline);
        assertEquals("Мяу",cat.getSound());
    }

    @Test // Проверка с Mock заглушкой класса Feline (назвал mockitorFeline) и вызван в классе Cat в кострукторе
          // Получается глушу весь класс Feline в конструкторе объекта cat
    public void testGetFood()throws Exception{
        when(mockitorFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(mockitorFeline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"),cat.getFood());
    }
}
