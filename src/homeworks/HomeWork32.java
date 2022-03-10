package homeworks;

import java.util.Scanner;

public class HomeWork32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first integer: ");
        int one = in.nextInt();
        System.out.print("Input second integer: ");
        int two = in.nextInt();
        if (one > two){
            System.out.println(one+" > "+two);
        }else if (two > one){
            System.out.println(two+" > "+one);
        } else {
            System.out.println("numbers are equal");
        }
    }
}
