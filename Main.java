package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type: 1 - Complex, 2 - Rational");
        int choice = sc.nextInt();

        Pair p;

        if (choice == 1) {
            System.out.print("Enter re1, im1, re2, im2: ");
            p = new Complex(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        } else {
            System.out.print("Enter num1, den1, num2, den2: ");
            p = new Rational(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        p.Print();
        System.out.println("Sum: " + p.Sum());
        System.out.println("Min: " + p.Min());
        System.out.println("Mult: " + p.Mult());
        System.out.println("Del: " + p.Del());
    }
}
