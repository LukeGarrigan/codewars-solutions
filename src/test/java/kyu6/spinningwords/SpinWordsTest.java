package kyu6.spinningwords;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpinWordsTest {

    private SpinWords spinWords = new SpinWords();

    @Test
    void spinWords() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }

    @Test
    void reverse() {

    }
}