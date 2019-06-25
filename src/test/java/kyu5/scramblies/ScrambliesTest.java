package kyu5.scramblies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ScrambliesTest {

    @Test
    void scramble() {
        assertEquals(Scramblies.scramble("rkqodlw","world"), true);
        assertEquals(Scramblies.scramble("cedewaraaossoqqyt","codewars"),true);
        assertEquals(Scramblies.scramble("katas","steak"),false);
        assertEquals(Scramblies.scramble("scriptjavx","javascript"),false);
        assertEquals(Scramblies.scramble("scriptingjava","javascript"),true);
        assertEquals(Scramblies.scramble("scriptsjava","javascripts"),true);
        assertEquals(Scramblies.scramble("javscripts","javascript"),false);
        assertEquals(Scramblies.scramble("aabbcamaomsccdd","commas"),true);
        assertEquals(Scramblies.scramble("commas","commas"),true);
        assertEquals(Scramblies.scramble("sammoc","commas"),true);

    }


    @Test
    void testJavaScriptyOne() {
        assertEquals(Scramblies.scramble("scriptjavx","javascript"),false);
    }
}