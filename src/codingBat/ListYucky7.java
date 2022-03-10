package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListYucky7 {
    public static void main(String[] args) {
//        Return the sum of the numbers in the array list. Except the number 7 is yucky,
//        so it does not count and numbers that come immediately after a 7 also do not count.
//        yucky7([1, 4]) → 5
//        yucky7([1, 2, 7, 3]) → 3
//        yucky7([1, 7, 8, 5, 7]) → 6
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(1, 7, 8, 5, 7));
        System.out.println(yucky7(numsList));
    } public static int yucky7(List<Integer> numsList){
        int sum = 0;
        if (numsList.size()==0){
            return 0;
        }
        if (numsList.get(0)!=7){
            sum = sum + numsList.get(0);
        }

        for (int i =1; i<numsList.size(); i++){
            if (numsList.get(i)!=7){
                if (numsList.get(i-1) !=7){
                    sum = sum+numsList.get(i);
                }}

        } return sum;
    }
}
