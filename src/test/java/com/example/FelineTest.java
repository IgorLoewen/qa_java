package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class FelineTest extends TestsSetUp{

    @Test  // Проверка с mockSpy (назвал felineSpion) и вызван мокШпион внутри проверочного класса Feline
           // мокируем только вызов метода getFood и выводим фиктивный результат списка
    public void testEatMeat()throws Exception{
     when(felineSpion.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
     assertEquals(List.of("Животные", "Птицы", "Рыба"),felineSpion.eatMeat());
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
    public void testGetKittensOverWritten(){
        int Parameter = 1;
        assertEquals(1,feline.getKittens(Parameter));
    }
}
