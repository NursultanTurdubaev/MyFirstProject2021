package ifElseLesson;

import java.util.Scanner;

public class LoginPassword {
    public static void main(String[] args) {
        String login = "login@gmail.com";
        int password = 123;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your login");

        String login2 = scan.nextLine();
        System.out.println("Please enter your password");
        int pass = scan.nextInt();

        if (login.equals(login2) && password == pass){
            System.out.println("Welcome");

        }
        else System.err.println("Error");


    }
}
