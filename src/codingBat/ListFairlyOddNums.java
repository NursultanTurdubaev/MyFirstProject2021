package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFairlyOddNums {
    public static void main(String[] args) {
//        Return the sum of the numbers in the array list that are odd and have an even index,
//        or the number is even and its index is odd.
//        fairlyOddNums([1, 2, 3, 4]) → 10
//        fairlyOddNums([8, 16, 10]) → 16
//        fairlyOddNums([5, 0, 13, 51]) → 18
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(5, 0, 13, 51));
        System.out.println(fairlyOddNums(numsList));


    } public static int fairlyOddNums(List<Integer> numsList){
        int sum = 0;
        for (int i=0; i<numsList.size(); i++){
            if (numsList.get(i)%2==0 && i%2!=0){
                sum = sum + numsList.get(i);
            }else if (numsList.get(i)%2!=0 && i%2==0){
                sum = sum + numsList.get(i);
            }
        }
        return sum;

    }
}
