package ifElseLesson;

import java.util.Scanner;

public class HomeWorkIfNumbers2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter any number from 0 to 10:");
        int fromUser = in.nextInt();
        while(fromUser>=10 || fromUser<=0){
            System.out.println("Please type a valid number from 0 to 10:");
            fromUser = in.nextInt();
        }
        System.out.println(fromUser);

    }
}
