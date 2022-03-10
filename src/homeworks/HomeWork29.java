package homeworks;

import java.util.Scanner;

public class HomeWork29 {
    public static void main(String[] args) {
        int i, n, sum = 0;

        System.out.print("Input number of terms is: ");
        {
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            System.out.println("The odd numbers are :");
            for (i = 1; i <= n; i++) {
                System.out.println(2 * i - 1);
                sum += 2 * i - 1;
            }
            System.out.println("The Sum of odd Natural Number up to " + n + " terms is: " + sum);

        }
    }
}
