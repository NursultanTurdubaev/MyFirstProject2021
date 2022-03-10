package ifElseLesson;
import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number");
        int num = scan.nextInt();
        if (num%2 == 0){  // (28%2 == 0) ----> 0 == 0 --> true
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");


        }
    }
}
