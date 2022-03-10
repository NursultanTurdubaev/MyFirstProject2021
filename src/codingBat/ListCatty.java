package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCatty {
    public static void main(String[] args) {
//        An array list contains a list of animals. If the animal is a cat
//        (i.e. the animal's description contains the word "cat" or "Cat"),
//        then add it to a new array list. Return the new array list of cats.
//        catty(["buffalo", "dog"]) → []
//        catty(["bobcat", "siamese cat", "catbird"]) → ["bobcat", "siamese cat", "catbird"]
//        catty(["Cat", "frog", "mouse"]) → ["Cat"]
        ArrayList<String> animalsList = new ArrayList<>(Arrays.asList("buffalo", "dog"));
        System.out.println(catty(animalsList));

    } public static List<String> catty(List<String> animalsList){
     ArrayList<String> result = new ArrayList<>();
     for (String i: animalsList){
         if (i.contains("Cat") || i.contains("cat")){
             result.add(i);
         }
     } return result;
    }
}
