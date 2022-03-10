package ifElseLesson;

import java.util.Scanner;

public class ExchangeUsdKgs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How much soms do you want to exchange?");
        float num1 = scan.nextFloat();
        System.out.println("$ "+ num1/84.7);
        System.out.println("How much dollars do you want to exchange?");
        float num2 = scan.nextFloat();
        System.out.println(num2*84.7+ " kgs");



    }
}
