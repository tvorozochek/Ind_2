package javaapplication3;

public class Complex implements Pair {
    private double a, b;
    private double c, d;

    Complex(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public String Sum() {
        return (a + c) + " + " + (b + d) + "i";
    }

    @Override
    public String Min() {
        return (a - c) + " + " + (b - d) + "i";
    }

    @Override
    public String Mult() {
        double resRe = a * c - b * d;
        double resIm = a * d + b * c;
        return resRe + " + " + resIm + "i";
    }

    @Override
    public String Del() {
        double denominator = c * c + d * d;
        if (denominator == 0) return "Error: Division by zero";
        double resRe = (a * c + b * d) / denominator;
        double resIm = (b * c - a * d) / denominator;
        return resRe + " + " + resIm + "i";
    }

    @Override
    public void Print() {
        System.out.println("Numbers: (" + a + " + " + b + "i) and (" + c + " + " + d + "i)");
    }
}
