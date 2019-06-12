package kyu6.missingletter;

public class MissingLetter {


    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static char findMissingLetter(char[] array) {
        char letterToExpect = array[0];
        for (char currentChar : array) {
            if (currentChar != letterToExpect) {
                break;
            }
            letterToExpect++;
        }
        return letterToExpect;
    }

}
