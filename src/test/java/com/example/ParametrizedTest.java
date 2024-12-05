package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParametrizedTest {


    @ParameterizedTest
    @CsvSource({
            "'Хищник', 'Животные,Птицы,Рыба'",
            "'Травоядное', 'Трава,Различные растения'"
    })
    void testGetFood(String inputType, String expectedOutput) throws Exception {
        Feline feline = new Feline();
        List<String> expectedList = List.of(expectedOutput.split(","));
        assertEquals(expectedList, feline.getFood(inputType));
    }

/*
    void testGetFoodWithStringPredator() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }

    @Test
    public void testGetFoodWithStringTravoyadnoe() throws Exception{
        Feline feline = new Feline();
        assertEquals(List.of("Трава", "Различные растения"),feline.getFood("Травоядное"));
    }*/
}