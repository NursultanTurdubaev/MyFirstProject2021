package strings;

import java.util.Locale;

public class HomeworkJira {
    public static void main(String[] args) {
        String coffee = "CoFFee";

        // .toLowerCase()
        System.out.println(coffee.toLowerCase(Locale.ROOT));

        // .toUpperCase()
        System.out.println(coffee.toUpperCase());

        // replace(char, old char, char, newChar)
        String mouse = "mouse";
        System.out.println(mouse.replace('m', 'M'));
        String firstName = "Zamirbekuva";
        System.out.println(firstName.replace('u', 'o'));

        // method chaining
        String country = " Kirgizstan";
        String trimmed = country.trim();
        String convertToLowerCase = trimmed.toLowerCase();
        String replaceChars = convertToLowerCase.replace('i', 'y');
        String convertToUpperCase = replaceChars.toUpperCase();
        System.out.println(country + '\n' + convertToLowerCase + '\n' + replaceChars + '\n' + convertToUpperCase);
        System.out.println("----------------------------------------------------------------");

        String country2 = "     Kirgizstan  ".trim().toLowerCase().replace('i', 'y').toUpperCase();
        System.out.println(country2);

        // difference between == and  .equals()

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(" 1== : " + (s1 == s2)); // true
        System.out.println(s1.equals(s2));

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3==s4); // false
        System.out.println(s3.equals(s4));

        // pool -> basseyn
        // heap -> kucha
        // == --> reference/address
        // .equals() --> values


    }
}
