package homeworks;

import java.util.Scanner;

public class HomeWork37 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Type in your mark in Chemistry: ");
        int chemistry = in.nextInt();
        System.out.print("Type in your mark in Mathematics: ");
        int mathematics = in.nextInt();
        System.out.print("Type in your mark in English: ");
        int english = in.nextInt();
        System.out.print("Type in your mark in Biology: ");
        int biology = in.nextInt();
        System.out.print("Type in your mark in Physics: ");
        int physics = in.nextInt();
        int average = (chemistry + mathematics + english + biology + physics) / 5;
        if (average >= 80) {
            System.out.println("Your grade is A");
        } else if (average < 80 && average >= 60) {
            System.out.println("Your grade is B");
        } else if (average < 60 && average >= 40) {
            System.out.println("Your grade is C");
        } else {
            System.out.println("Your grade is D");
        }
    }
}
