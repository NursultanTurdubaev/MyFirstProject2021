package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListGuessAverage {
    public static void main(String[] args) {
//        A teacher gives her students extra credit if they can guess the class average for a
//        given test and their guess is within 5% of the average.
//        Given a list of grades and the student's guess, return true if the student receives
//        extra credit and false if they don't receive extra credit.
//        guessAverage([90, 80, 85], 85) → true
//        guessAverage([88, 78, 92], 92) → false
//        guessAverage([80], 75) → false
        ArrayList<Integer> numsList = new ArrayList<>(Arrays.asList(80, 75, 80, 85));
        int guess = 76;
        System.out.println(guessAverage(numsList,guess));


    } public static boolean guessAverage(List<Integer> numsList, int guess){
        int sum =0;
        for (int i : numsList){
            sum = sum + i;
        }
        int average = sum/numsList.size();
        int fivePercent = (average*5)/100;
        return Math.abs(average - guess) <= fivePercent;


    }
}
