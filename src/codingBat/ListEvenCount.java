package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEvenCount {
    public static void main(String[] args) {
//                Return the count of all the even numbers in the array list. Hint: The % operator may be useful.
//                evenCount([1, 2, 3, 4]) → 2
//                evenCount([8, 16, 10]) → 3
//                evenCount([5, 0, 22]) → 2
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(evenCount(numsList));
    }
    public static int evenCount(List<Integer> numsList){
        int count = 0;
        for (int i =0; i<numsList.size(); i++){
            if (numsList.get(i)%2==0){
                count++;
            }
        }
        return count;
    }
}
