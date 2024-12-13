package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GetKittensOverwrittenParametrizedTest extends TestsSetUp {

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
}
