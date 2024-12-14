package com.example;

import java.util.List;

public class AlexLion extends Lion {
    public AlexLion(IndependentLion independentLion) throws Exception {
        super("Самец", independentLion);
    }

    public List<String> getFriends() {
        return List.of("Зебра Марти, Бегемотиха Глория, Жираф Мелман");
    }

    public String getPlaceOfLiving() {
        return ("Нью-Йоркский зоопарк");
    }

    @Override
    public int getKittens() {
        return 0;
    }
}