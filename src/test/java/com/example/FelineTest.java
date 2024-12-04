package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
}
