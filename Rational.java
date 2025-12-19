package javaapplication3;

public class Rational implements Pair {
    private final int n1, d1;
    private final int n2, d2;

    Rational(int n1, int d1, int n2, int d2) {
        this.n1 = n1;
        this.d1 = d1;
        this.n2 = n2;
        this.d2 = d2;
    }

    @Override
    public String Sum() {
        int resN = n1 * d2 + n2 * d1;
        int resD = d1 * d2;
        return resN + "/" + resD;
    }

    @Override
    public String Min() {
        int resN = n1 * d2 - n2 * d1;
        int resD = d1 * d2;
        return resN + "/" + resD;
    }

    @Override
    public String Mult() {
        return (n1 * n2) + "/" + (d1 * d2);
    }

    @Override
    public String Del() {
        if (n2 == 0) return "Error: Division by zero";
        return (n1 * d2) + "/" + (d1 * n2);
    }

    @Override
    public void Print() {
        System.out.println("Fractions: " + n1 + "/" + d1 + " and " + n2 + "/" + d2);
    }
}
