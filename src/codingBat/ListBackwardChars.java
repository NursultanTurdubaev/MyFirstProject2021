package codingBat;

import java.util.ArrayList;
import java.util.List;

public class ListBackwardChars {
    public static void main(String[] args) {
//        Given a string, return an array list that contains each character of the string in backwards order.
//        backwardChars("Career Center") → ["r", "e", "t", "n", "e", "C", " ", "r", "e", "e", "r", "a", "C"]
//        backwardChars("football") → ["l", "l", "a", "b", "t", "o", "o", "f"]
//        backwardChars("?") → ["?"]
        String str = "Career Center";
        System.out.println(backwardChars(str));
    }
    public static List<String> backwardChars(String str){
        ArrayList<String> result = new ArrayList<>();
        for (int i =str.length()-1; i>=0; i--){
            result.add(str.substring(i,i+1));
        }
        return result;
    }
}
