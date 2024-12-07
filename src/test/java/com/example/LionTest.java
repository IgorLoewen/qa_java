package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class LionTest extends TestsSetUp {

    @Test // Изолированный юнит тест с мокированием в конструкторе класса интерфейcа IndependetLion
          // с помощью объекта mockitorIndependentLion, который наследуется из TestsSetUp
          // и добавлена проверка verify, что метод getKittens() вызывается
    public void testGetKittens()throws Exception{
       when(mockitorIndependentLion.getKittens()).thenReturn(1);
       Lion lion = new Lion("Самец",mockitorIndependentLion);
       assertEquals(1,lion.getKittens());
       Mockito.verify(mockitorIndependentLion).getKittens();
    }


}
