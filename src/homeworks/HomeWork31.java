package homeworks;

import java.util.Scanner;

public class HomeWork31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int one = in.nextInt();
        System.out.print("Input the second number : ");
        int two = in.nextInt();
        System.out.print("Input the third number : ");
        int three = in.nextInt();
        boolean result = one+two==three;
        System.out.println("The result is: "+result);

    }
}
