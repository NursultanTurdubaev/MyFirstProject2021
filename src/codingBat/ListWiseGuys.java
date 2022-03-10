package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListWiseGuys {
    public static void main(String[] args) {
//        An array list contains the ages of married couples in a village.
//        The ages are listed in pairs, so if there are two couples, ages 50, 52 and 35, 30
//        they would be listed in the array list as {50, 52, 35, 30}.
//        The village considers the wisest couple to be the one with the highest combined age.
//                Return the combined age of the wisest couple.
//                There will be an even number of elements in the array list.
//                wiseGuys([20, 18]) → 38
//                wiseGuys([30, 33, 40, 21]) → 63
//                wiseGuys([25, 25, 30, 29, 60, 62]) → 122
        ArrayList<Integer> agesList = new ArrayList<>(Arrays.asList());
        System.out.println(wiseGuys(agesList));
    } public static int wiseGuys(List<Integer> agesList){
        if (agesList.size()==0){
            return 0;
        }
        int combinedAge = agesList.get(0) + agesList.get(1);
        if (agesList.size()==2){
            return combinedAge;
        }
        for (int i =0; i<agesList.size()-1; i++){
            combinedAge = Math.max(combinedAge,agesList.get(i)+agesList.get(i+1));
            i=i+1;
        } return combinedAge;
    }
}
