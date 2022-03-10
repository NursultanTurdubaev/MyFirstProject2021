package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        System.out.print("Please enter any number between 1 and 5 inclusive: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        Integer[] mass = new Integer[num];
        List<Integer> list = new ArrayList(Arrays.asList(mass));
        for (int i =0; i <list.size(); i++){
            list.set(i, i+1);
        }
        System.out.println(list);





    }
}
