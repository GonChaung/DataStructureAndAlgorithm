package Recursion;

public class MathCase {
    public double powerOfANumber(double n, double exponent) {
        if (exponent == 0){
            return 1;
        }else if (exponent > 0){
            return n * powerOfANumber(n, exponent - 1);
        }else return 1 / powerOfANumber(n, - exponent); // for negative exponent
    }

    public int GCD(int a, int b) {
        if (b == 0){
            return a;
        }else return GCD(b , a % b);
    }
}
