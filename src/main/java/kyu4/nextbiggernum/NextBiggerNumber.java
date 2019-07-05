package kyu4.nextbiggernum;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Luke.Garrigan
 * @since 05/07/2019
 */
public class NextBiggerNumber {

    public static long nextBiggerNumber(long n) {
        String number = String.valueOf(n);
        for (int i = number.length() - 1; i >= 0; i--) {
            int currentNumber = Integer.parseInt(String.valueOf(number.charAt(i)));
            for (int j = i - 1; j >= 0; j--) {
                if (currentNumber > Integer.parseInt(String.valueOf(number.charAt(j)))) {
                    StringBuilder sb = new StringBuilder(number);
                    sb.setCharAt(i, number.charAt(j));
                    sb.setCharAt(j, number.charAt(i));


                    sortEndNumbers(j + 1, sb);


                    return Integer.parseInt(sb.toString());
                } else if (currentNumber == Integer.parseInt(String.valueOf(number.charAt(j)))) {
                    break;
                }
            }
        }
        return n;
    }

    private static void sortEndNumbers(int j, StringBuilder sb) {
        String endOfString = new StringBuilder(sb.toString().substring(j, sb.toString().length())).toString();
        Integer[] numbers = new Integer[endOfString.length()];
        for (int i = 0; i < endOfString.length(); i++) {
            numbers[i] = Integer.parseInt(String.valueOf(endOfString.charAt(i)));
        }

        Arrays.sort(numbers);


        for (int i = 0; i < numbers.length; i++) {
            Integer currentNumber = numbers[i];
            sb.setCharAt(j + i, currentNumber.toString().charAt(0));
        }
    }
}
