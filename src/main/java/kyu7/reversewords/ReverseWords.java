package kyu7.reversewords;

/**
 * @author Luke.Garrigan
 * @since 02/07/2019
 */
public class ReverseWords {


    public static String reverseWords(final String original) {
        String[] words = original.split(" ");
        StringBuilder reversedWords = new StringBuilder();

        for (int i = 0; i < words.length - 1; i++) {
            reversedWords.append(new StringBuilder(words[i]).reverse().toString());
            reversedWords.append(" ");
        }
        reversedWords.append(new StringBuilder(words[words.length - 1]).reverse().toString());


        return reversedWords.toString().trim();
    }

}
