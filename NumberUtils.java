package CodeWars;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153));
    }

    public static boolean isNarcissistic(int number) {
        int origin = number;
        int base = Integer.toString(number).length();
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        int sum = 0;
        for (int num : digits) sum += (int) Math.pow(num, base);
        return sum == origin;
    }

}