package homeworks;

import java.util.Arrays;

public class HomeWork40 {
    public static void main(String[] args) {
        HomeWork40 object = new HomeWork40();
        System.out.println("perimeter is "+object.perimeter(4,5));
        System.out.println("area is "+object.area(4,5));
        System.out.println("perimeter is "+object.perimeter(10,12));
        System.out.println("area is "+object.area(10,12));
        System.out.println("perimeter is "+object.perimeter(7,9));
        System.out.println("area is "+object.area(7,9));

    }
    public int perimeter(int a, int b){
        int perim = (a*2)+ a*2;
        return perim;
    }
    public int area(int h, int l){
        int area = h*l;
        return area;
    }
}
