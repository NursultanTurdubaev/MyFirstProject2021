package homeworks;

import java.util.Scanner;

public class HomeWork24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the 1st number: ");
        int a= scan.nextInt();
        System.out.println("Input the 2nd number: ");
        int b= scan.nextInt();
        System.out.println("Input the 3rd number: ");
        int c= scan.nextInt();
        if (a>b)
            if (a>c)
                System.out.println("The greatest: "+a);
        if (b>a)
            if (b>c)
                System.out.println("The greatest: "+b);
        if (c>a)
            if (c>b)
                System.out.println("The greatest: "+c);
        if (a==b)
            if (b==c)
                System.out.println("Numbers are equal");


    }
}
