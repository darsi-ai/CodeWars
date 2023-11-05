package CodeWars;

public class Troll {
    public static String disemvowel(String str) {
        String alphabet = "euioaEUIOA";
        StringBuilder modifiedStr = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!alphabet.contains(String.valueOf(c))) {
                modifiedStr.append(c);
            }
        }
        return modifiedStr.toString();
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("Object-oriented programming"));
    }
}