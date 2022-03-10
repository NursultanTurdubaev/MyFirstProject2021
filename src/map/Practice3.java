package map;

import java.lang.reflect.Array;
import java.util.*;

public class Practice3 {
    public static void main(String[] args) {
        //([“giraffe, “dolphin, "giraffe", “cat”, "cat", "cat"]) ➞ {"cat"=3, "giraffe"=2, "dolphin"=1}
        String[] list = {"giraffe","dolphin","giraffe","cat","cat","cat"};
        System.out.println(convert(list));




    } private static Map<String, Integer> convert(String[] list) {
        int cat = 0;
        int giraffe = 0;
        int dolphin = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals("cat")) {
                cat++;
            }
            if (list[i].equals("giraffe")) {
                giraffe++;
            }
            if (list[i].equals("dolphin")) {
                dolphin++;
            }
        }
        Map<String, Integer> finalresult = new HashMap<>();
        finalresult.put(list[0], giraffe);
        finalresult.put(list[1], dolphin);
        finalresult.put(list[3], cat);
        return finalresult;
    }
}
