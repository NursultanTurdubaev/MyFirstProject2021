package ternaryOperator;

import java.util.Scanner;

public class GirlsAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int GirlsAge = 18;
        int age = scan.nextInt();
        String res = age >= GirlsAge ? "You are welcome" : "Sorry, you cannot enter the club";
        System.out.println(res);

    }
}

 