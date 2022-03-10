package homeworks;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HomeWork26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the 5 numbers :");
        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();
        int four = in.nextInt();
        int five = in.nextInt();
        DecimalFormat dec = new DecimalFormat("#0.0");
        System.out.println("The sum of 5 numbers is: " + (one + two + three + four + five));
        System.out.println("The average is: " + dec.format((one + two + three + four + five) / 5));
    }
}
