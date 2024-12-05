package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class FelineTest {

   @Test
    public void testEatMeat() throws Exception {
        Feline felineSpy = Mockito.spy(new Feline());
        when(felineSpy.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"),felineSpy.eatMeat());
    }

    @Test
    public void testGetFamily(){
        Feline feline = new Feline();
        assertEquals("Кошачьи",feline.getFamily());
    }

    @Test
    public void testGetKittens (){
        Feline feline = new Feline();
        assertEquals(1,feline.getKittens());
    }

    @Test
    public void testGetKittensWithInt (){
       Feline feline = new Feline();
       int kittensCount = 1;
       assertEquals(kittensCount,feline.getKittens(1));
    }

    @Test
    public void testGetFoodWithStringPredator() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }

    @Test
    public void testGetFoodWithStringTravoyadnoe() throws Exception{
        Feline feline = new Feline();
        assertEquals(List.of("Трава", "Различные растения"),feline.getFood("Травоядное"));
    }

    @Test
    public void testGetFoodExpectionCase() throws Exception {
        Feline feline = new Feline();
        Exception exception = assertThrows(Exception.class, () -> {
            feline.getFood("Пох");
        });
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }

}
