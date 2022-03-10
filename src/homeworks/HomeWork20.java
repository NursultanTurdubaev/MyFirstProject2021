package homeworks;

import java.util.Scanner;

public class HomeWork20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any number below:");
        int number= scan.nextInt();
        if (number>0){
            System.out.println("number is positive");
        } else if (number<0){
            System.out.println("number is negative");
        } else {
            System.out.println("number is zero");
        }
    }
}
