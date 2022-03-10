package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListWackyWords {
    public static void main(String[] args) {
//        An array list contains a list of words. Take the first character of the first word and concatenate it
//        as the first character of each word and take the last character of the last word and concatenate it
//        as the last character of each word. Return the modified array list of words.
//        wackyWords(["buffalo", "dog"]) → ["bbuffalog", "bdogg"]
//        wackyWords(["football", "player", "silly"]) → ["ffootbally", "fplayery", "fsillyy"]
//        wackyWords(["great"]) → ["ggreatt"]
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList("football", "player", "silly"));
        System.out.println(wackyWords(wordsList));
    } public static List<String> wackyWords(List<String> wordsList){
        for (int i=0; i<wordsList.size(); i++){
            String temp = wordsList.get(wordsList.size()-1);
            wordsList.set(i,wordsList.get(0).charAt(0) + wordsList.get(i));
            wordsList.set(i, wordsList.get(i)+ temp.charAt(temp.length()-1));

        } return wordsList;
    }
}
