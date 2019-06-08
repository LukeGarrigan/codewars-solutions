package kyu5.ismyfriendcheating;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemovedNumbersTest {


    @Test
    public void testGetAllPossibleNumbers() {

        long[] allPossibleNumbers = RemovedNumbers.getAllPossibleNumbers(3);

        long sum = 0;
        for (int i = 0; i < allPossibleNumbers.length; i++) {
            sum += allPossibleNumbers[i];
        }

        assertEquals(6, sum);
    }

    @Test
    public void testRemovedNumbers() {
        assertEquals(2, RemovedNumbers.removedNumbers(26).size());
    }

    @Test
    public void testTheirExample() {
        List<long[]> res = new ArrayList<>();
        List<long[]> a = RemovedNumbers.removedNumbers(100);
        assertTrue(res.size() == a.size());
    }


    @Test
    public void testWithBigNumbers() {
        assertEquals(0, RemovedNumbers.removedNumbers(1717869183).size());
    }

    @Test
    public void testWith290() {
        assertEquals(2, RemovedNumbers.removedNumbers(290).size());
    }



}
