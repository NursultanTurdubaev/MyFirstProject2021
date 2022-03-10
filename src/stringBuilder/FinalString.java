package stringBuilder;

import java.util.Scanner;

public class FinalString {
    public static void main(String[] args) {

        // final ->> constant which makes the object unchangeable
        // mutable ->> changeable StringBuilder
        // immutable --> unchangeable String

        final String data = "08.12.2021";

        StringBuilder mark = new StringBuilder("Zara");
        mark.substring(1);
        System.out.println(mark); // result will be Zara because we didn't change the value of String mark

        String name = "John";
        name = "Clark";
        name.toUpperCase();
        name.concat("James");
        System.out.println(name); // result is Clark because String is immutable

        System.out.println("---------------------------------------------------");

        StringBuilder phone = new StringBuilder("Black");
        phone.append("Berry");
        System.out.println(phone); // result is BlackBerry because StringBuilder is mutable

        String color1 = new String("Yellow");
        color1.toUpperCase();
        String color2 = "Yellow";
        String color3 = "Yellow";
        System.out.println(color1); // result is not changed to YELLOW because String is immutable

        StringBuilder sb1 = new StringBuilder("White");
        StringBuilder sb2 = new StringBuilder("White");
        sb2.append("Black");
        sb2.replace(0,5,"Pink");
        System.out.println(sb2);

        System.out.println("-----------------------------------");

        String StringName = "John Doe";
        int x = 0;
        x = StringName.length() - 3;
        System.out.println(StringName.substring(x));
        System.out.println("---------------------------------------------------");

        // The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
        // We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.













    }
}
