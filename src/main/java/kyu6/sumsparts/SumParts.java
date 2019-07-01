package kyu6.sumsparts;

import java.util.stream.IntStream;

/**
 * @author Luke.Garrigan
 * @since 01/07/2019
 */
public class SumParts {


    public static int[] sumParts(int[] ls) {

        long total = IntStream.of(ls).sum();
        int[] summed = new int[ls.length + 1];
        for (int i = 0; i < ls.length; i++) {
            summed[i] = (int) total;
            total -= ls[i];
        }
        summed[ls.length] = 0;
        return summed;
    }

}
