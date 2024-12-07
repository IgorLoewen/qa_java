package com.example;


import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public class TestsSetUp {


    //Тут я выношу все мне нужные объекты для всех тестов и объявляю их
    protected Feline feline;
    protected IndependentLion independentLion;

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