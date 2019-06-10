package kyu6.positionsaverage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PositionsAverageTest {


    @Test
    public void testSplitString() {
        String sentenceToBeSplit = "Blar, blar2";
        assertEquals(2, PositionsAverage.splitString(sentenceToBeSplit).length);
    }


    @Test
    public void testCountForCommonPositions() {
        String[] data = new String[]{"1234", "1334"};
        assertEquals(3, PositionsAverage.getCountForNumberOfSimilarities(data));
    }

    @Test
    public void testTheirSimpleExample() {
        assertEquals(26.666666666666668, PositionsAverage.posAverage("6900690040, 4690606946, 9990494604"));
    }

    @Test
    public void testPositionsAverage() {
        double average = PositionsAverage.posAverage("444996, 699990, 666690, 096904, 600644, 640646, 606469, 409694, 666094, 606490");
        assertEquals(29.2592592593, average);
    }


}
