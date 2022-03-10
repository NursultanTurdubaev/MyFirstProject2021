package homeworks;

import java.util.Scanner;

public class HomeWork28 {
    public static void main(String[] args) {
        int n,i,m;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number (Table to be calculated) : ");
        m=in.nextInt();
        System.out.println("Input number of terms : ");
        n=in.nextInt();
        for (i = 0; i <= n; i++) {
            System.out.println(m+" x "+i+" = "+(m*i));
        }

    }
}
