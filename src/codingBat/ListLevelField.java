package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListLevelField {
    public static void main(String[] args) {
//        A field is considered level if all of its elevation readings are within 8 inches of each other.
//        Given a list of elevation readings of the field in inches,
//        return true or false to indicate whether the field is level.
//        If there are less than 3 readings, there is not enough data and you should return false in that case.
//        levelField([11, 10, 14, 8]) → true
//        levelField([11, 10, 14, 8, 10, 17]) → false
//        levelField([4, 6]) → false
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(4, 6));
        System.out.println(levelField(numsList));
    }public static boolean levelField(List<Integer> numsList){
        if (numsList.size()<3){
            return false;
        }
        int min = numsList.get(0);
        int max = numsList.get(0);
        for (int i =0; i<numsList.size(); i++){
            min = Math.min(min,numsList.get(i));
            max = Math.max(max,numsList.get(i));
        }
        if (max-min >8){
            return false;
        }
        return true;

    }
}
