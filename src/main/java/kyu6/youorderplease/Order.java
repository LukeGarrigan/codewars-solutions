package kyu6.youorderplease;

public class Order {

    public static String order(String words) {
        String[] split = words.split(" ");

        String[] finalWords = new String[split.length];

        for (String word : split) {
            for (int i = 0; i < word.length(); i++) {
                char currentCharacter = word.charAt(i);
                if (Character.isDigit(currentCharacter)) {
                    finalWords[Character.getNumericValue(currentCharacter)-1] = word;
                    break;
                }
            }
        }

        return String.join(" ", finalWords);
    }
}
