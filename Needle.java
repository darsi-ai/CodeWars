package CodeWars-wars;

public class Needle {
    public static String findNeedle(Object[] haystack) {
        int position = 0;
        while (position < haystack.length) {
            if (haystack[position] instanceof String && haystack[position].equals("needle")){
                break;
            }
            else position += 1;
        }
        return "found the needle at position" + position;
    }

    public static void main(String[] args) {
        Object[] haystack = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        System.out.println(findNeedle(haystack));
    }
}