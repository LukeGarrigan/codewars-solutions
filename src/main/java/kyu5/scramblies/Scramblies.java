package kyu5.scramblies;

public class Scramblies {


    public static boolean scramble(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            str2 = str2.replaceFirst("" +str1.charAt(i), "");
            if (str2.isEmpty()) {
                return true;
            }
        }
        return false;
    }


}
