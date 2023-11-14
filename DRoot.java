package CodeWars;

public class DRoot {
    public static int digital_root(int n) {
        while (n > 9) {
            int sum = 0;
            char[] nums = Integer.toString(n).toCharArray();
            for (char num : nums) {
                sum += Integer.parseInt(String.valueOf(num));
            }
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(digital_root(942));
    }
}
