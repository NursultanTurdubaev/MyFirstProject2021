package homeworks;

import java.util.Scanner;

public class HomeWork30 {
    public static void main(String[] args) {
        System.out.println("Enter the width of the Triangle:");
        Scanner in = new Scanner(System.in);
        float base = in.nextFloat();
        System.out.println("Enter the height of the Triangle:");
        float height = in.nextFloat();
        float area = (base * height)/2;
        System.out.println("Area of the triangle is: "+area);
    }
}
