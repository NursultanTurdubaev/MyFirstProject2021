package strings;

import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        // String -> Non primitive data type

        String str = "Hello";
        String str2 = new String("World");
        System.out.println(str + " " + str2);

        //              012345
        String brand = "Chanel";
        //              123456

        // .length()
        System.out.println(brand.length());

        // .charAt(int i)
        System.out.println(brand.charAt(4));
        System.out.println(brand.charAt(1));

        // .concat(String str)
        //                     0123456789
        String nameOfBrands = "Name of brands: ";
        System.out.println(nameOfBrands.concat(brand));
        System.out.println(nameOfBrands + brand);

        // .subString(int i)

        System.out.println(nameOfBrands.substring(3));
        System.out.println(nameOfBrands.substring(0, 3));

        // .trim()
        String laptop = " Mac Book Pro 2021        ";
        String strWithoutSpace = laptop.trim();
        System.out.println(laptop);
        System.out.println(strWithoutSpace);

        System.out.println("------------------------------------");

        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String wordWithoutSpace = word.trim();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(word);
        System.out.println(wordWithoutSpace);


        String phone = "Apple        ";
        System.out.println(phone.length());


    }
}
