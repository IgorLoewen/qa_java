package com.example;

import java.util.List;

public class Lion {

    private final boolean hasMane;
    private final IndependentLion independentLion;

    public Lion(String sex, IndependentLion independentLion) throws Exception {
        this.independentLion = independentLion;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }



    public int getKittens() {
        return independentLion.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return independentLion.getFood("Хищник");
    }
}