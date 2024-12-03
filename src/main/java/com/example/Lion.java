package com.example;

import java.util.List;

public class Lion {

    private boolean hasMane;
    private AnimalActions animalActions;

    public Lion(String sex, AnimalActions animalActions) throws Exception {
        this.animalActions = animalActions;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return animalActions.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return animalActions.getFood("Хищник");
    }
}
