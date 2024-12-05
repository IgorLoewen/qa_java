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
    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }
}
