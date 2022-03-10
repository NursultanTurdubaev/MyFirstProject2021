package methods;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        //        The given strings is: Welcome
//        The given numbers is: 3
//        The new string is: Welome
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number:");
        int num1 = scan.nextInt();
        StringBuilder str2 = new StringBuilder();
        System.out.println(enter(new StringBuilder("Welcome"),num1));
    }

    public static StringBuilder  enter (StringBuilder str, int num1){

        return(str.deleteCharAt(num1));

    }


}
