package com.example;


import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import java.util.List;

public class TestsSetUp {


    //Тут я выношу все мне нужные объекты для всех тестов и объявляю их
    protected Feline feline;
    // заглушка для интерфейса.  Пока реальная реализация отсутствует и неизвестна!
    protected IndependentLion independentLion = new IndependentLion() {
        @Override
        public int getKittens() {
            return 0;
        }
        @Override
        public List<String> getFood(String animalKind) throws Exception {
            return List.of();
        }
    };

    protected Feline mockitorFeline;
    protected Feline felineSpion;

    protected IndependentLion mockitorIndependentLion;

    protected String sex;



    //Здесь произвожу настройку инициализации объектов для всех тестов
    @BeforeEach
    public void initializeObjects() throws Exception {
        feline = new Feline();
        sex = "Самец"; // Значение по умолчанию

        mockitorFeline = Mockito.mock(Feline.class);
        felineSpion = Mockito.spy(new Feline());

        mockitorIndependentLion = Mockito.mock(IndependentLion.class);


    }

}