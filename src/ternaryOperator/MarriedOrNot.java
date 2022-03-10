package ternaryOperator;

import java.util.Scanner;

public class MarriedOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Are you married?");
        String answer = scan.nextLine();

        boolean output = (answer.equals("Yes")) ? true : false;
        System.out.println(output);




    }
}
