package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ListSumEvenIndexes {
    public static void main(String[] args) {
//        Return the sum of all the numbers at even positions in the array list.
//        sumEvenIndexes([1, 2, 3, 4]) → 4
//        sumEvenIndexes([8, 16, 10]) → 18
//        sumEvenIndexes([5, 0, -10]) → -5
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(5, 0, -10));
        System.out.println(numsList);
        System.out.println(sumEvenIndexes(numsList));
    }
    public static int sumEvenIndexes(List<Integer> numsList){
        int count = 0;
        for (int i =0; i< numsList.size(); i++){
            if (i%2==0){
                count=count+numsList.get(i);
            }
        }
     return count;
    }
}
