package switchCaseStatement;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a day of the week in numbers");
        int dayOfWeek = scan.nextInt();
        String nameOfWeek = "";

        switch (dayOfWeek) {
            case 1: nameOfWeek = "Monday";
            break;
            case 2: nameOfWeek = "Tuesday";
            break;
            case 3: nameOfWeek = "Wednesday";
            break;
            case 4: nameOfWeek = "Thursday";
            break;
            case 5: nameOfWeek = "Friday";
            break;
            case 6: nameOfWeek = "Saturday";
            break;
            case 7: nameOfWeek = "Sunday";
            break;
            default: nameOfWeek = "Invalid day of the week mthfckr";
        }
        System.out.println(nameOfWeek);
//        if (dayOfWeek == 1) {
//            System.out.println("Monday");
//
//        } else if (dayOfWeek == 2) {
//            System.out.println("Tuesday");
//        } else if (dayOfWeek == 3) {
//            System.out.println("Wednesday");
//        }
    }
}
