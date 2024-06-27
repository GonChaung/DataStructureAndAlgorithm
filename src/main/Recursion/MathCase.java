package main.Recursion;

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
    public int stringToInteger(String str){
        if(str.length() == 1){
            return str.charAt(0) - '0';
        }
        double y = stringToInteger(str.substring(1));
        double x = str.charAt(0) - '0';
        x = x * Math.pow(10, str.length() - 1) + y;
        return (int)x;
    }

    public int sumOfNaturalNumbers(int n){
        if(n <= 1){
            return 1;
        }else return n + sumOfNaturalNumbers(n-1);
    }

    public int sumOfDigits(int n){
        if(n == 0){
            return n;
        }else return (n % 10) + sumOfDigits(n/10);
    }
}
