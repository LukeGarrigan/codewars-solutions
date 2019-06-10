package kyu6.positionsaverage;

import java.util.HashMap;
import java.util.Map;

// todo https://www.codewars.com/kata/positions-average/train/java

public class PositionsAverage {


    public static double posAverage(String s) {
        String[] data = splitString(s);

        double countForNumberOfDifference = getCountForNumberOfSimilarities(data);

        double numberOfLetters = data[0].length() * data.length;

        return (countForNumberOfDifference / numberOfLetters) * 100;

    }


    public static String[] splitString(String sentenceToBeSplit) {
        return sentenceToBeSplit.split(", ");
    }




    public static int getCountForNumberOfSimilarities(String[] data) {
        int count = 0;

        for (int j = 0; j < data[0].length(); j++) {
            Map<Character, Integer> lettersAndCounts = new HashMap<>();
            for (int i = 0; i < data.length; i++) {
                char currentCharacter = data[i].charAt(j);

                if (lettersAndCounts.containsKey(currentCharacter)) {
                    lettersAndCounts.put(currentCharacter, lettersAndCounts.get(currentCharacter) + 1);
                } else {
                    lettersAndCounts.put(currentCharacter, 0);
                }
            }

            for (Integer value : lettersAndCounts.values()) {
                count += value;
            }
        }
        return count;

    }

}
