package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class AlexLionTest extends TestsSetUp{
    protected AlexLion alexLion = new AlexLion(independentLion);
    public AlexLionTest() throws Exception {
    }

    @Test
    public void testGetFriends()throws Exception{
        assertEquals(List.of("Зебра Марти, Бегемотиха Глория, Жираф Мелман"),alexLion.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving()throws Exception{
        assertEquals("Нью-Йоркский зоопарк",alexLion.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens()throws Exception{
        assertEquals(0,alexLion.getKittens());
    }
}