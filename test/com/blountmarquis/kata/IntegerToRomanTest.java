package com.blountmarquis.kata;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by MLBlount on 12/24/2015.
 */
public class IntegerToRomanTest {


    @Test
    public void whenNumberIsOneReturnI() {
        assertEquals("I", IntegerToRoman.getRoman(1));
    }

    @Test
    public void whenNumberIsFiveReturnV() {
        assertEquals("V", IntegerToRoman.getRoman(5));
    }

    @Ignore
    public void whenNumberIsTwoReturnII() {
        assertEquals("II", IntegerToRoman.getRoman(2));
    }
}
