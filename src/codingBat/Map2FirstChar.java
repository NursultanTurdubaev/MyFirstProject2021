package codingBat;

import java.util.HashMap;
import java.util.Map;

public class Map2FirstChar {
    public static void main(String[] args) {
//        Given an array of non-empty strings, return a Map<String, String> with a key
//        for every different first character seen, with the value of all the strings starting with
//        that character appended together in the order they appear in the array.
//        firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
//        firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
//        firstChar([]) → {}

    }
    public static Map<String, String> firstChar(String[] strings){
        Map<String,String> map = new HashMap<>();
        for (String i : strings){
            map.put(i.substring(0,1),word(strings,i.charAt(0)));
        }return map;
    }
    public static String word(String[] str, char s){
        String result = "";
        for (String i : str){
            if (s == i.charAt(0)){
                result = result + i;
            }
        }return result;
    }
}
