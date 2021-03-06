package codingBat;

import java.util.HashMap;
import java.util.Map;

public class Map2Pairs {
    public static void main(String[] args) {
//        Given an array of non-empty strings, create and return a Map<String, String> as follows:
//        for each string add its first character as a key with its last character as the value.
//        pairs(["code", "bug"]) → {"b": "g", "c": "e"}
//        pairs(["man", "moon", "main"]) → {"m": "n"}
//        pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
        String[] strings = {"man", "moon", "good", "night"};
        System.out.println(pairs(strings));
    }
    public static Map<String, String> pairs(String[] strings){
        Map<String,String> map = new HashMap<>();
        for (String i: strings){
            map.put(i.substring(0,1),i.substring(i.length()-1,i.length()));
        }return map;
    }
}
