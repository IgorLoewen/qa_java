package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CatTest extends TestsSetUp{

    @Test // самая простая проверка в классе Cat с конструктором feline
    public void testGetSound(){
        Cat cat = new Cat(feline);
        assertEquals("Мяу",cat.getSound());
    }

    @Test // Проверка с mockSpy (назвал felineSpion) и вызван мокШпион в классе Cat в кострукторе
          // Получается мокирую только объект в классе Cat
    public void testGetFood()throws Exception{
        when(felineSpion.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(felineSpion);
        assertEquals(List.of("Животные", "Птицы", "Рыба"),cat.getFood());
    }
}
