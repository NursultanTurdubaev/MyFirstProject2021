package ifElseLesson;

import java.util.Scanner;

public class EqualNumbersOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first number");
                int num1 = scan.nextInt();
        System.out.println("Please enter your second number");
        int num2 = scan.nextInt();
        boolean equals = true ;
        if (num1 == num2) {
            System.out.println(equals);
        } else if (num1 != num2){
            System.out.println(!equals);
        }
       // System.out.println(equals);
//        if (num1==num2){
//            System.out.println("True");
//
//        } else {
//            System.out.println("False");
//        }


    }
}
