package org.example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public double divide(int a, int b) {

        if (b == 0) {
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

    private void neSertaRien() {

    }
    public void neSertaRienPublic() {

    }

}
