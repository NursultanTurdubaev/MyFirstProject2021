package homeworks;

import java.util.Scanner;

public class HomeWork21 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter any two numbers below:");
        int a= scan.nextInt();
        int b= scan.nextInt();
        if (a>b){
            System.out.println("The greatest: "+a);
        } else if (a<b){
            System.out.println("The greatest: "+b);
        } else {
            System.out.println("numbers are equal");
        }
    }
}
