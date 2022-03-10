package homeworks;

import java.util.Scanner;

public class HomeWork36 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1= in.nextInt();
        System.out.print("Enter second integer: ");
        int number2= in.nextInt();
        int temp = 0;
        temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("After the swap, first integer is: "+number1+", second integer is: "+number2);


    }
}
