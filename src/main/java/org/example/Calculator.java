package org.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double divide(int a, int b) {

        if (b == 0) {
            System.out.println("Division par zéro");
//            return a < 0 ?  Double.MIN_VALUE : Double.MAX_VALUE;
            if (a == 0) {
                return 0;
            }
            if (a < 0) {
                return Double.MIN_VALUE;
            }
            return Double.MAX_VALUE;
        }

        return (double) a / b;
    }

}
