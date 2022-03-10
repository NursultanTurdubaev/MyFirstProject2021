package strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter your last name:");
        String lastName = scan.nextLine();
        System.out.println("Please, enter your first name:");
        String firstName = scan.nextLine();

        if (lastName.contains("ова") || lastName.contains("ева")) {
            System.out.println(lastName.replaceAll("ева", "кызы"));
            System.out.println(firstName.concat(lastName.replaceAll("ова", " кызы")));
        } else if (lastName.contains("ов") || lastName.contains("ев")){
            System.out.println(firstName.concat(lastName.replaceAll("ов"," уулу")));
            System.out.println(firstName + " " +(lastName.replaceAll("ев"," уулу")));


        }

    }
}
