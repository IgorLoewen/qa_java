package com.example;

import java.util.List;

public class Lion {

 private boolean hasMane;
 private IndependentLion Lion;

    public Lion(String sex, IndependentLion Lion) throws Exception {
        this.Lion = Lion;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }



    public int getKittens() {
        return Lion.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return Lion.getFood("Хищник");
    }
}