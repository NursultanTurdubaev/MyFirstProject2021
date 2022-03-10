package ifElseLesson;

import java.util.Scanner;

public class AgeAndDresscode {
    public static void main(String[] args) {
        int age = 15;
        char status = 'F';
        String dressCode = "BlackAndWhite";
        if (age > 23){
            if (status == 'F'){
                System.out.println("Free beverage for you!");
                if (dressCode.equals("BlackAndWhite")){
                    System.out.println("You look beautiful!");
                }
                else {
                    System.out.println("You don't match our dress code!");
                }
            }
            else {
                System.out.println("Sorry maan!");
            }
        }
        else {
            System.out.println("You didn't pass age control!");
        }

    }
    }

