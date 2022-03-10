package codingBat;

import java.util.HashMap;
import java.util.Map;

public class Map2WordCount {
    public static void main(String[] args) {
//        The classic word-count algorithm: given an array of strings, return a Map<String, Integer>
//        with a key for each different string, with the value the number of times that string appears in the array.
//        wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
//        wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
//        wordCount(["c", "c", "c", "c"]) → {"c": 4}
        String[] strings = {"a", "b", "a", "c", "b"};
        System.out.println(wordCount(strings));
    }
    public static Map<String, Integer> wordCount(String[] strings){
        Map<String,Integer> result = new HashMap<>();
        for (String i : strings){
            result.put(i,count(strings,i));
        }return result;
    }
    public static int count(String[] strings, String check){
        int temp = 0;
        for (String i : strings){
            if (i.equals(check)){
                temp++;
            }
        }return temp;
    }
}
