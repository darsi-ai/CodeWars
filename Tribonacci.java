package CodeWars;

import java.util.Arrays;

public class Tribonacci {

    public double[] tribonacci(double[] s, int n) {
        if (n == 0) return new double[0];
        double[] result = Arrays.copyOf(s, n);
        for(int j = 3; j < n; j++){
            result[j] = result[j-1] + result[j-2] + result[j-3];
        }
        return result;
    }
}