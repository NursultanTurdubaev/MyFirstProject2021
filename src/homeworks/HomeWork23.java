package homeworks;

import java.util.Scanner;

public class HomeWork23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a day of the week in numbers:");
        int dayOfTheWeek = scan.nextInt();
        String nameOfTheWeek = "";
        switch (dayOfTheWeek) {
            case 1:
                nameOfTheWeek = "Monday";
                break;
            case 2:
                nameOfTheWeek = "Tuesday";
                break;
            case 3:
                nameOfTheWeek = "Wednesday";
                break;
            case 4:
                nameOfTheWeek = "Thursday";
                break;
            case 5:
                nameOfTheWeek = "Friday";
                break;
            case 6:
                nameOfTheWeek = "Saturday";
                break;
            case 7:
                nameOfTheWeek = "Sunday";
                break;
            default:
                nameOfTheWeek = "Invalid number was entered";
        }
        System.out.println(nameOfTheWeek);

    }
}
