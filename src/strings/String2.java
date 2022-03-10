package strings;

public class String2 {
    public static void main(String[] args) {
        String home = "Sweet home ";

        // .indexof(String str) finds index of any character we want starting from any point we chooose
        System.out.println(home.indexOf("home"));
        System.out.println(home.indexOf('e', 5));
        System.out.println(home.indexOf('S'));
        System.out.println(home.lastIndexOf('e'));
        System.out.println(home.lastIndexOf(' '));
        System.out.println(home.substring(3));
        System.out.println(home.lastIndexOf('e', 4));

        String brand1 = "H&M";
        String brand2 = "ZARA";
        System.out.println(brand1.equals(brand2));

        // .equalIgnoreCase(String str)
        String flower1 = "Rose";
        String flower2 = "rosE";
        System.out.println(flower1.equals(flower2)); //false
        System.out.println(flower1.equalsIgnoreCase(flower2)); // true


        // == > difference from .equals


        String str1 = "Hello"; // short way of creating string data
        String str2 = new String("Hello"); // long way of creating string


    }
}
