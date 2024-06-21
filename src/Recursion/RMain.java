package Recursion;

public class RMain {
    public static void main(String[] args) {
//        HanoiTower hanoiTower = new HanoiTower();
//        int n = 3;
        MathCase mc = new MathCase();
//        // hanoiTower.towerOfHanoi(n, 'A', 'C', 'B');
////
////        AdjacentDuplicate adjacentDuplicate = new AdjacentDuplicate();
////        String str = "ejeerkokfdker";
////        String result = adjacentDuplicate.rremove(str);
////        System.out.println(result);
//        int gcdCase = mc.GCD(7,49);
//        // System.out.println(gcdCase);
//        double twoPower = mc.powerOfANumber(2,-3);
//        // System.out.println(twoPower);
//        int sumOfNatural = mc.sumOfNaturalNumbers(5);
//        //System.out.println(sumOfNatural);
//        int sumOfDigit = mc.sumOfDigits(12345);
//        //System.out.println(sumOfDigit);
        int strToint = mc.stringToInteger("12345");
        System.out.println(strToint + " is of type " + ((Object)strToint).getClass().getSimpleName());
    }
}
