package arrays;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        String flowers = "Rose";

        String[] flowers2 = {"Rose", "Orchid"};
        System.out.println("First way: "+ Arrays.toString(flowers2));

        String flowers3 []= new String[2];
        flowers3[0]= "Rose";
        flowers3[1]= "Orchid";
        System.out.println("Second way: "+ Arrays.toString(flowers3));

        System.out.println(flowers3[0]);



    }
}
