package homeworks;

import java.util.Scanner;

public class HomeWork39 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = in.nextLine();
        System.out.print("Your age: ");
        int age = in.nextInt();
        if (age < 16) {
            System.out.println("You can't drive, " +name);
        } if (age >= 16 && age <= 17) {
            System.out.println("You can drive but not vote, "+name);
        }
        if (age >= 18 && age <= 24) {
            System.out.println("You can vote but not rent a car, "+name);
        }
        if (age >= 25) {
            System.out.println("You can do pretty much anything, "+name);
        }
    }
}
