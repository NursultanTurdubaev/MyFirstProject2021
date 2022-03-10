package ifElseLesson;

import java.util.Scanner;

public class SkyJumper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your age");
        int age = scan.nextInt();
        System.out.println("Please type your weight in kilograms");
        int weight = scan.nextInt();

        if (age >= 18){
            if (age <=80){
                if (weight <=150){
                    System.out.println("You are ok to jump from the airplane!");
                } else
                    System.out.println("Your weight doesn't allow you to jump");
            } else
                System.out.println("Your age doesn't allow you to jump");

        } else
            System.out.println("Your age dosn't allow you to jump");
    }
}
