package kyu6.spinningwords;

public class SpinWords {


    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            if (word.length() >= 5) {
                sb.append(new StringBuilder(word).reverse());
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }


}
