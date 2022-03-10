package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFreeSoup {
    public static void main(String[] args) {
//        You are having dinner with your significant other and you would like to have soup if it is free.
//                The restaurant offers free soup if the total purchase of both of your entrees is at
//        least $20 and each of you orders at least $5 worth of desserts or appetizers.
//                Each array list identifies the amount of money each of you spends on the appetizer,
//        entree, and dessert (in that order).
//                Return true if you get free soup. Else if no soup for you, then return false.
//                freeSoup([6, 11, 0], [0, 16, 5]) → true
//        freeSoup([6, 8, 0], [0, 16, 5]) → true
//        freeSoup([4, 12, 0], [5, 16, 5]) → false
        ArrayList<Integer> aList = new ArrayList<>(Arrays.asList(6, 8, 0));
        ArrayList<Integer> bList = new ArrayList<>(Arrays.asList(0, 16, 5));
        System.out.println(freeSoup(aList,bList));

    } public static boolean freeSoup(List<Integer> aList, List<Integer> bList){
        if (aList.get(1)+bList.get(1)>=20){
            if (aList.get(0)+aList.get(2)>=5){
                if (bList.get(0)+bList.get(2)>=5){
                    return true;
                }
            }
        } return false;

    }
}
