package com.example;

import java.util.List;

public class Feline extends Animal implements Predator, AnimalActions {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    @Override
    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    @Override
    public List<String> getFood(String type) throws Exception {
        if ("Хищник".equals(type)) {
            return List.of("Мясо", "Рыба");
        } else {
            throw new Exception("Тип питания не поддерживается");
        }
    }
}
