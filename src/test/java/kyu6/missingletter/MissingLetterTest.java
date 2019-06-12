package kyu6.missingletter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MissingLetterTest {



    @Test
    public void testMissingLetter() {
        char[] array = {'a', 'b', 'c', 'e'};
        assertEquals('d',MissingLetter.findMissingLetter(array));
    }

    @Test
    public void exampleTests() {
        assertEquals('e', MissingLetter.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', MissingLetter.findMissingLetter(new char[] { 'O','Q','R','S' }));
    }

}
