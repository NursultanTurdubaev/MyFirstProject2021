package ifElseLesson;
import java.util.Scanner;
public class HighestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type number 1");
        long num1 = scan.nextLong();
        System.out.println("Please type number 2");
        long num2 = scan.nextLong();
        System.out.println("Please type number 3");
        long num3 = scan.nextLong();
        if (num1>=num2) {
            System.out.println(num1+ " is the highest number");
        }
        else if (num2>=num3) {
            System.out.println(num2+ " is the highest number");

        } else if (num3>=num2) {
            System.out.println(num3+ " is the highest number");
        }



    }
}
