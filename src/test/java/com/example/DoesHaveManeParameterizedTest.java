package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DoesHaveManeParameterizedTest extends TestsSetUp {

    @ParameterizedTest // Проверка метода getKittens(int parameter) класса Feline
    // Использую @ValueSource для передачи одного параметра (целого числа типа int)
    // Метод проверяет, что метод getKittens() возвращает то же значение, которое было передано
    // Так же заданы минимальное и максимальные значения возможные для int
    @ValueSource(ints = {1, 9999, 2147483647, 0, -1, -2147483648 })
    public void testGetKittensOverWritten(int parameter) {
        assertEquals(parameter, feline.getKittens(parameter));
    }

}
