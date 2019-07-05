package kyu4.nextbiggernum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Luke.Garrigan
 * @since 05/07/2019
 */
class NextBiggerNumberTest {

    @Test
    void nextBiggerNumberEasy() {
        assertEquals(132,NextBiggerNumber.nextBiggerNumber(123));
    }

    @Test
    void nextBiggerNumberHarder() {
        assertEquals(423,NextBiggerNumber.nextBiggerNumber(342));
    }
    @Test
    void complicatedOne() {
        assertEquals(8079,NextBiggerNumber.nextBiggerNumber(7980)); // 8079
    }

    @Test
    void biggerNumber() {
        assertEquals(1234567980,NextBiggerNumber.nextBiggerNumber(1234567908));

        assertEquals(1234568079,NextBiggerNumber.nextBiggerNumber(1234567980));
    }

    @Test
    void theBreaker() {
        assertEquals(414, NextBiggerNumber.nextBiggerNumber(144));
    }


    @Test
    void biggerNumberBreaker() {
        assertEquals(908,NextBiggerNumber.nextBiggerNumber(890));
    }


    @Test
    void enlightenedTest() {
        assertEquals(847,NextBiggerNumber.nextBiggerNumber(784));
    }

    @Test
    void theirTests() {
        assertEquals(21, NextBiggerNumber.nextBiggerNumber(12));
        assertEquals(531, NextBiggerNumber.nextBiggerNumber(513));
        assertEquals(2071, NextBiggerNumber.nextBiggerNumber(2017));
        assertEquals(441, NextBiggerNumber.nextBiggerNumber(414));
    }


    @Test
    void exampleTestsFoundOnline() {
        assertEquals(12001, NextBiggerNumber.nextBiggerNumber(11200));
    }


    @Test
    void exampleTestsFoundOnline2() {
        assertEquals(16359, NextBiggerNumber.nextBiggerNumber(15963));
    }

}