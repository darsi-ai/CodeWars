package CodeWars;

public class RomanConversion {
    public static String solution(int n) {
        if (n < 1 || n > 3999) {
            return "Number out of range";
        }
        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[n / 1000] + hundreds[(n % 1000) / 100] + tens[(n % 100) / 10] + units[(n % 10)];
    }

    public static void main(String[] args) {
        String res = solution(1999);
        System.out.println(res);
    }
}