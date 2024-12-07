package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTest extends TestsSetUp {

    @ParameterizedTest // Проверка метода doesHaveMane() класса Lion.
    // Использую @CsvSource для передачи сразу двух параметров: значения пола String и ожидаемого результата boolean
    // Метод проверяет, возвращает ли правильное значение поле hasMane в зависимости от пола
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    public void testDoesHaveMane(String sex, boolean expectedHasMane) throws Exception {
        Lion lion = new Lion(sex, mockitorIndependentLion);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }

    @ParameterizedTest // Проверка метода getKittens(int parameter) класса Feline
    // Использую @ValueSource для передачи одного параметра (целого числа типа int)
    // Метод проверяет, что метод getKittens() возвращает то же значение, которое было передано
    // Так же заданы минимальное и максимальные значения возможные для int
    @ValueSource(ints = {1, 9999, 2147483647, 0, -1, -2147483648 })
    public void testGetKittensOverWritten(int parameter) {
        assertEquals(parameter, feline.getKittens(parameter));
    }
}
