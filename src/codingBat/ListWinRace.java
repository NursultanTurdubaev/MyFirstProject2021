package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListWinRace {
    public static void main(String[] args) {
//        An array list contains the number of votes in each district for a given political candidate named Jones.
//        There are only two candidates in the race and his opponent is named Sims.
//        Positive numbers indicate that Jones won by that number of votes and
//        negative numbers indicate that Sims won by that number of votes.
//                The winner of the race is the candidate that has the most total votes from all the districts.
//                Jones wins if there is a tie since he is the incumbent.
//                Return true if Jones won and false if Sims won.
//        winRace([20, -15]) → true
//        winRace([20, 200, -300, 10, -10]) → false
//        winRace([-25, 20, 3, 2]) → true
        ArrayList<Integer> votesList = new ArrayList<>(Arrays.asList(-25, 20, 3, 2));
        System.out.println(winRace(votesList));

    } public static boolean winRace(List<Integer> votesList){
        int sum = 0;
        for (int i : votesList){
            sum = sum +i;
        }
        if (sum >=0){
            return true;
        }
        return false;
    }
}
