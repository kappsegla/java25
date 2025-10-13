package org.fungover.functional;

public class PureOrNot {

    static void main() {
        PureOrNot pon = new PureOrNot();
        int a = pon.pureValueVersion(10, Math.random());
        int sum = pon.sum(1, 2);

    }

    public int numberOne() {
        return 1;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public int value(int a) {
        return (int) (a * Math.random());
    }

    public int pureValueVersion(int a, double random) {
        return (int) (a * random);
    }

    private int sum = 0;

    public int sum(int a) {
        sum += a;
        return sum;
    }


}
