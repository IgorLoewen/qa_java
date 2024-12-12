package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FelineTest extends TestsSetUp{

    @Test // Проверка вызова метода getFood("Хищник") у мокШпиона Feline
          // важно для следующего теста!
    public void testGetFoodCalled() throws Exception {
        when(felineSpion.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        felineSpion.eatMeat();
        Mockito.verify(felineSpion).getFood("Хищник");
    }

    @Test // Проверка, что метод eatMeat() возвращает ожидаемый результат
    public void testEatMeatReturnsCorrectValue() throws Exception {
        when(felineSpion.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        assertEquals(List.of("Животные", "Птицы", "Рыба"), felineSpion.eatMeat());
    }


    @Test // простая проверка метода getFamily(), которая прям там возврашает строку "Кошачьи"
    public void testGetFamily(){
      assertEquals("Кошачьи",feline.getFamily());
    }


    @Test// Тоже самая простая проверка, переписания метода со значением 1 в поле. По моему без пояснений понятно
    public void testGetKittens(){
        assertEquals(1,feline.getKittens());
    }


    @Test // Проверка переписания метода со значением. Принимает параметр любым целым числом типа данных int
          // Возможна параметризация, но что то особо не вижу смысла в данном случае. Метод 100% проверяется одним значением с такой логикой.
          // Но отдельно добавил и параметризованный тест в ParametrizedTest
    public void testGetKittensOverWritten(){
        int Parameter = 1;
        assertEquals(1,feline.getKittens(Parameter));
    }


    @Test // Проверка, что метод getFood("Хищник") у мокШпиона был вызван!
           // важно для следующего теста!
    public void testGetFoodCalledWithSpy() throws Exception {
        Mockito.doReturn(List.of("Животные", "Птицы", "Рыба")).when(felineSpion).getFood("Хищник");
        felineSpion.getFood("Хищник");
        Mockito.verify(felineSpion).getFood("Хищник");
    }

    @Test // Проверка результата работы метода getFood("Хищник") у мокШпиона
    public void testGetFoodReturnsCorrectValueWithSpy() throws Exception {
        Mockito.doReturn(List.of("Животные", "Птицы", "Рыба")).when(felineSpion).getFood("Хищник");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), felineSpion.getFood("Хищник"));
    }


}
