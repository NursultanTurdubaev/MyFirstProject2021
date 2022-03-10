package homeworks;

import java.util.Scanner;

public class HomeWork22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any two numbers below:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println("Sum of two integers: " + (a + b));
        System.out.println("Difference of two integers: " + (a - b));
        System.out.println("Product of two integers: " + (a * b));
        System.out.println("Average of two integers: " + ((a + b) / 2));
        System.out.println("Distance of two integers: " + (a - b));
        if (a > b) {
            System.out.println("Max integer: " + a);
            System.out.println("Min integer: " + b);
        } else if (b > a) {
            System.out.println("Max integer: " + b);
            System.out.println("Min integer: " + a);
        } else {
            System.out.println("Max integer: " + a);
        }


    }
}
