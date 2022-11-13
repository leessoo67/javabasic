package org.example.encap;

import org.example.inherit.IdolDancer;
import org.example.inherit.StreetDancer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DancerTest {

    @Test
    void danceTest() {

        //Dancer dancer = new Dancer("서울짱크루", Grade.HIGH, "춤신춤왕");
        //dancer.dance();
        //dancer.setHeight(178);

        //System.out.println("dancer = " + dancer);
    }

    @Test
    void idolTest() {

        IdolDancer jungguk
                = new IdolDancer("BTS", Grade.HIGH, "정국");

        jungguk.dance();

        StreetDancer park
                = new StreetDancer("을지로크루", Grade.MIDDLE, "박춤꾼");
        park.dance();

        System.out.println("jungguk = " + jungguk);
    }

}