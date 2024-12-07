package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

public class LionTest extends TestsSetUp {

    @Test // Изолированный юнит тест с мокированием в конструкторе класса интерфейcа IndependetLion
          // с помощью объекта mockitorIndependentLion, который наследуется из TestsSetUp
          // и добавлена проверка verify, что метод getKittens() вызывается
    public void testGetKittens()throws Exception{
       when(mockitorIndependentLion.getKittens()).thenReturn(1);
       Lion lion = new Lion(sex,mockitorIndependentLion);
       assertEquals(1,lion.getKittens());
       Mockito.verify(mockitorIndependentLion).getKittens();
    }

    @Test // Отдельный простой юнит тест для проверки булевого метода doesHaveMane
          // проверяем отдельно "Самец" и возращение true
          // Это для моего личного понимания. Параметризированный тест на следующие 2 метода, находятся отдельно
          // в классе ParametrizedTest
    public void testDoesHaveManeMale()throws Exception{
       Lion maleLion = new Lion("Самец",mockitorIndependentLion);
        assertTrue(maleLion.doesHaveMane());
    }

    @Test  // Отдельный простой юнит тест для проверки булевого метода doesHaveMane
           // проверяем отдельно "Самка" и возращение false
    public void testDoesHaveManeFemale()throws Exception {
        Lion femaleLion = new Lion("Самка", independentLion);
        assertFalse(femaleLion.doesHaveMane());
    }

    @Test // Юнит тест на проверку исключения класса Expection в классе Lion
          // через мокировние класса интерфейса, через который вызывается реализация
          // метода doesHaveMane и в конце сверяю ожидаемое сообщение с текстом исключения
    public void testDoesHaveManeException()throws Exception{
        Exception exception = assertThrows(Exception.class, () ->{
         new Lion("Пох",mockitorIndependentLion);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка",
                      exception.getMessage());
    }

    @Test // проверка с помощью мокирования mockitorIndependentLion класса интрефейса
          // и передачи этого мока в конструкто объекта Lion
    public void testGetFood()throws Exception{
        when(mockitorIndependentLion.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion(sex,mockitorIndependentLion);
        assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
        Mockito.verify(mockitorIndependentLion).getFood("Хищник");
    }

}
