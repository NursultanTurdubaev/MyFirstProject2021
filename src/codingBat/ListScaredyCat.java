package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ListScaredyCat {
    public static void main(String[] args) {
//        An array list contains a list of pets that are following each other to a big pet party.
//        The pet at position 0 is following the pet at position 1.
//        If the pet is a cat that is being followed by a dog, it gets scared and runs away,
//                so you should remove it from the array list. Return the array list of pets.
//        scaredyCat(["cat", "dog", "guinea pig"]) → ["cat", "dog", "guinea pig"]
//        scaredyCat(["cat", "frog", "cat", "dog", "cat"]) → ["cat", "frog", "cat", "dog"]
//        scaredyCat(["cat", "dog", "cat", "cat", "snake"]) → ["cat", "dog", "snake"]
        ArrayList<String> petsList = new ArrayList<>(Arrays.asList("cat", "dog", "cat", "cat", "snake"));
        System.out.println(scaredyCat(petsList));

    } public static List<String> scaredyCat(List<String> petsList){
        for (int i=1; i<petsList.size(); i++){
            if (Objects.equals(petsList.get(i), "cat") && Objects.equals(petsList.get(i - 1), "dog")){
                petsList.remove(i);
                i=i-1;
            }
        } return petsList;
    }
}
