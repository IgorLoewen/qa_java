package com.example;

import java.util.List;

public class AlexLion extends Lion{


    public AlexLion(AnimalActions animalActions) throws Exception {
        super("Самец", animalActions);
    }

    public List<String> getFriends(){
        return List.of("Зебра Марти","Бегемотиха Глория","Жираф Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }
    @Override
    public int getKittens() {
        return 0;
    }

}
