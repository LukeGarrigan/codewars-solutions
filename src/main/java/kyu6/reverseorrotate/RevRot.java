package kyu6.reverseorrotate;

/**
 * @author Luke.Garrigan
 * @since 03/07/2019
 */
public class RevRot {

    public static String revRot(String strng, int sz) {

        if (sz <= 0 || sz > strng.length()) return "";
        String[] splitNumbers = getChunks(strng, sz);

        for (int i = 0; i < splitNumbers.length; i++) {
            String splitNumber = splitNumbers[i];

            try {
                if (getSumOfCubes(Integer.parseInt(splitNumber)) % 2 == 0) {
                    splitNumbers[i] = reverseNumber(splitNumber);
                } else {
                    splitNumbers[i] = rotateToLeftByOne(splitNumber);
                }

            } catch(Exception exception) {
                splitNumbers[i] = rotateToLeftByOne(splitNumber);
            }


        }
        return getConcatenatedNumbers(splitNumbers);
    }

    static String getConcatenatedNumbers(String[] splitNumbers) {
        StringBuilder sb = new StringBuilder();

        for (String splitNumber : splitNumbers) {
            sb.append(splitNumber);
        }
        return sb.toString();
    }

    static String rotateToLeftByOne(String splitNumber) {
        String original = String.valueOf(splitNumber);

        StringBuilder sb = new StringBuilder(original.length());

        for (int i = 1; i < original.length(); i++) {
            sb.append(original.charAt(i));
        }

        sb.append(original.charAt(0));

        return sb.toString();

    }

    static String reverseNumber(String splitNumber) {
        return new StringBuilder(String.valueOf(splitNumber)).reverse().toString();
    }

    static String[] getChunks(String strng, int sz) {
        String[] splitNumbers = new String[strng.length() / sz];

        int arrayPos = 0;
        StringBuilder numberAsString = new StringBuilder();
        for (int i = 0; i < strng.length(); i++) {
            if (i % sz == 0 && i != 0) {
                splitNumbers[arrayPos] = numberAsString.toString();
                numberAsString = new StringBuilder();
                arrayPos++;
            }
            numberAsString.append(strng.charAt(i));
        }

        return splitNumbers;
    }

    static int getSumOfCubes(int splitNumber) {
        String numberAsString = String.valueOf(splitNumber);

        int total = 0;
        for (int i = 0; i < numberAsString.length(); i++) {
            total += Math.pow(Integer.parseInt(String.valueOf(numberAsString.charAt(i))),3);
        }

        return total;
    }
}
