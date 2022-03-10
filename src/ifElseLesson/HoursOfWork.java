package ifElseLesson;

import java.util.Scanner;

public class HoursOfWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type any 3 numbers you want to sum");
        long num1 = scan.nextLong();
        long num2 = scan.nextLong();
        long num3 = scan.nextLong();
        System.out.println(num1+num2+num3);
        long num4 = (num1+num2+num3)*60;
        System.out.println(num4);




    }
}
