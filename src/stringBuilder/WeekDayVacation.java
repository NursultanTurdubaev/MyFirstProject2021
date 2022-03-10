package stringBuilder;


import java.util.Scanner;

public class WeekDayVacation {
    public static void main(String[] args) {

        System.out.println("Please enter true if it's weekday and false if it's not!");
        Scanner sc = new Scanner(System.in);
        boolean weekDay = sc.nextBoolean();
        System.out.println("Please enter true if it's vacation and false if not!");
        boolean vacation = sc.nextBoolean();


        if (vacation || !weekDay){
            System.out.println("sweet dreams!");
        }
        else {
            System.out.println("U can't sleep!");
        }






    }
}
