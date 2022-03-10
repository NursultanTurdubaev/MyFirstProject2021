package strings;

import java.util.Scanner;

public class String4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your login: ");
        String login = scan.nextLine();
        System.out.println("Please enter your password: ");
        String password = scan.nextLine();
        System.out.println("Please enter your nickname; ");
        String nick = scan.nextLine();

        if (nick.contains("ова") || nick.contains("ева")) {
            System.out.println("Female");
        } else if (nick.contains("ов") || nick.contains("ев")) {
            System.out.println("Male");
        }
        else {
            System.out.println("You have entered the wrong nickname");

        }

    }
}
