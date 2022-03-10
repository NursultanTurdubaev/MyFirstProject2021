package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Map2 {
    public static void main(String[] args) {
        Map<String, String> brands = new HashMap<>();
        brands.put("Toyota", "Land Cruiser");
        brands.put("Mercedes","S class");
        brands.put("Audi","Q7");
        brands.put("Tesla","Moldel S");
        brands.put("Lada","2107");
        brands.replace("Toyota","Prado");
        System.out.println(brands);
        System.out.println(brands.get("Lada"));
        System.out.println(brands.values());
        System.out.println(brands.keySet());
        System.out.println(brands.size());

// , k, o, g —> {k = K, o = O, g = G}
        Map2 obj = new Map2();
        getcall(obj.scancall());

    }
    public Map<String, String> scancall() {
        Scanner scan3 = new Scanner(System.in);
        Map<String, String> map1 = new TreeMap<>();
        System.out.println("Please enter characters from a to z");
        String charname = "";
        while (charname == charname.toLowerCase()) {
            charname = scan3.nextLine();
            if(charname == charname.toLowerCase()){
                map1.put(charname,charname.toUpperCase());
            }
        }
        System.out.println("You have entered wrong Character");
        return map1;
    }
    public static void getcall (Map<String, String> map2){
        for (String i : map2.keySet()) {
            System.out.println(i + "-" + map2.get(i));
        }
    }



    }

