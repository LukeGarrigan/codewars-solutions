package kyu5.ismyfriendcheating;

import java.util.ArrayList;
import java.util.List;

public class RemovedNumbers {

    private static long SUM_OF_NUMBERS = 0;

    public static List<long[]> removedNumbers(long n) {
        SUM_OF_NUMBERS = getSum(n);
        return findNumbersHeRemoved(n);
    }


    public static long[] getAllPossibleNumbers(long n) {

        long[] numbers = new long[(int) n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    // a * b = sum - a - b
    // rearrange for b
    // a * b + b = sum - a
    // b(a + 1) = sum - a
    // b = sum - a / (a + 1)
    public static List<long[]> findNumbersHeRemoved(long n) {
        List<long[]> numbersHeRemoved = new ArrayList<>();
        for (int i = (int)n; i > 0 ; i--) {
            double otherNumber = (SUM_OF_NUMBERS - i) / (double)(i + 1);

            if (otherNumber < n && otherNumber % 1 == 0) {
                numbersHeRemoved.add(new long[]{(long)otherNumber, i});
                if (numbersHeRemoved.size() > 2) {
                    return new ArrayList<>();
                }
            }
        }

        return numbersHeRemoved;
    }


    private static long getSum(long number) {
        return number * (number + 1) / 2;
    }


}
