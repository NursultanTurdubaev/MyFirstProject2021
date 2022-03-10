package scaner;

import java.util.Scanner;

public class AreYouMarried {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Айдай, вы замужем?");
       //boolean status = scan.nextBoolean();
       String yes = scan.nextLine();
        if (yes.equals  ("yes")) {
            System.out.println("Айдай замужем " + yes);

        }
        else if (yes.equals("no")) {
        System.out.println("Ayday is not married");}

        else {
            System.err.println("error");
        }




    }
}
