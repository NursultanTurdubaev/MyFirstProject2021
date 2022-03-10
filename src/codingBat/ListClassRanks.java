package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListClassRanks {
    public static void main(String[] args) {
//        An array list contains the high school class ranks of my students.
//        If at least two of the students are in the top 10 of their class,
//        order the array list elements from highest rank to lowest rank.
//        Otherwise, order the array list elements from lowest rank to highest rank.
//        Return the array list of class ranks. Hint: Don't forget about the methods in the Collections class.
//        classRanks([40, 25, 12, 35, 125, 300, 63]) → [300, 125, 63, 40, 35, 25, 12]
//        classRanks([35, 72, 5, 22, 78, 3]) → [3, 5, 22, 35, 72, 78]
//        classRanks([2, 56, 24, 100]) → [100, 56, 24, 2]
        ArrayList<Integer> rankings = new ArrayList<>(Arrays.asList(35, 72, 5, 22, 78, 3));
        System.out.println(classRanks(rankings));

    } public static List<Integer> classRanks(List<Integer> rankings){
        int count = 0;
        for (int i:rankings){
            if (i<=10){
                count++;
            }
        }
        if (count >=2){
            Collections.sort(rankings);
        }
        if (count <2){
            Collections.sort(rankings,Collections.reverseOrder());
        }
        return rankings;
    }
}
