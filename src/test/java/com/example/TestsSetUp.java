package com.example;


import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

public class TestsSetUp {


    //Тут я выношу все мне нужные объекты для всех тестов и объявляю их
    protected Feline feline;
    protected Lion lion;

    protected Feline mockitorFeline;
    protected Feline felineSpion;



    //Здесь произвожу настройку инициализации объектов для всех тестов
    @BeforeEach
    public void initializeObjects() {
        feline = new Feline();

        mockitorFeline = Mockito.mock(Feline.class);

        felineSpion = Mockito.spy(new Feline());
    }




}