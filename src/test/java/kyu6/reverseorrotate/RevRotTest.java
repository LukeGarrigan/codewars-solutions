package kyu6.reverseorrotate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Luke.Garrigan
 * @since 03/07/2019
 */
class RevRotTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void testNumberFormatException() {
        String leadingZeros = "002";
        assertEquals(2, Integer.parseInt(leadingZeros));
    }

    @Test
    public void test1() {
        String numberFormatException = "97108121074847641791420461";
        testing(RevRot.revRot(numberFormatException, 3), "330479108928157");

        String s = "733049910872815764";
        testing(RevRot.revRot(s, 5), "330479108928157");
        testing(RevRot.revRot("1234", 0), "");
        testing(RevRot.revRot("", 0), "");
        testing(RevRot.revRot("1234", 5), "");
    }

    @Test
    public void testSumOfCubes() {
        assertEquals(36, RevRot.getSumOfCubes(123));
    }

    @Test
    public void testReverseNumber() {
        assertEquals("123", RevRot.reverseNumber("321"));
    }


    @Test
    public void testRotateToLeftByOne() {
        assertEquals("231", RevRot.rotateToLeftByOne("123"));
    }
}