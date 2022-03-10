package ifElseLesson;

import java.util.Scanner;

public class HomeworkIfNumbers {
    public static void main(String[] args) {
        askForNumber();
    }
    private static void askForNumber(){
        System.out.println("Please enter any number from 0 to 10:");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number<=10){
            System.out.println(number);
        }else if (number>10){
            askForNumber();
        }

    }
}
