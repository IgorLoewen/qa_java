package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class AlexLionTest extends TestsSetUp{

    public AlexLionTest() throws Exception {
    }

    @Test
    public void testGetFriends()throws Exception{
        AlexLion alexLion = new AlexLion(independentLion);
        assertEquals(List.of("Зебра Марти, Бегемотиха Глория, Жираф Мелман"),alexLion.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving()throws Exception{
        AlexLion alexLion = new AlexLion(independentLion);
        assertEquals("Нью-Йоркский зоопарк",alexLion.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens()throws Exception{
        AlexLion alexLion = new AlexLion(independentLion);
        assertEquals(0,alexLion.getKittens());
    }
}