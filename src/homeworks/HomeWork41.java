package homeworks;

import java.util.Scanner;

public class HomeWork41 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int first = in.nextInt();
        System.out.print("Enter the second integer: ");
        int second = in.nextInt();
        System.out.println("The sum is: "+getsum(first,second));

    }
    public static int getsum(int a, int b){
        int result = a+b;
        return result;

    }
}
