package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AlexLionTest {

    private AlexLion alexLion;


    @BeforeEach
    public void setup() throws Exception {
        AnimalActions animalActionsMock = Mockito.mock(AnimalActions.class);
        alexLion = new AlexLion(animalActionsMock);
    }

    @Test
    public void testGetFriends () throws Exception{
        assertEquals(List.of("Зебра Марти","Бегемотиха Глория","Жираф Мелман"),alexLion.getFriends());
    }

   @Test
   public void testGetPlaceOfLiving() throws Exception{
       assertEquals("Нью-Йоркский зоопарк",alexLion.getPlaceOfLiving());
   }


    @Test
    public void testGetGetKittens() throws Exception{
        assertEquals(0,alexLion.getKittens());
    }
}