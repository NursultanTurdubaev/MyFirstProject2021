package ternaryOperator;

import java.util.Scanner;

public class DollarOrOther {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Which currency?");
        String answer = scan.nextLine();
        String output = (answer.equals("Dollar")) ? "$" : "-";
        System.out.println(output);

    }
}
