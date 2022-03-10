package codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListGolfingBrothers {
    public static void main(String[] args) {
//        Three brother are very competitive and have a small wager on who is the best golfer this month.
//                They have recorded their scores for the month in separate array lists.
//        Return the name of the brother who has the lowest average for the month.
//        If a brother has less than two scores, he does not have enough scores to qualify as the best golfer.
//                At least one of the brothers will have enough scores to qualify.
//                golfingBrothers([70, 75, 80], [80, 82, 85], [90, 91, 92]) → "adam"
//        golfingBrothers([100, 75], [80, 82, 85, 86], [90, 91, 92]) → "bob"
//        golfingBrothers([70], [80, 82], [90, 91, 92]) → "bob"
        ArrayList<Integer> adamList = new ArrayList<>(Arrays.asList(70,75));
        ArrayList<Integer> bobList = new ArrayList<>();
        ArrayList<Integer> craigList = new ArrayList<>(Arrays.asList(72,72));
        System.out.println(golfingBrothers(adamList,bobList,craigList));
        System.out.println(aver(adamList));
    } public static String golfingBrothers(List<Integer> adamList, List<Integer> bobList, List<Integer> craigList){
        float adamSum = aver(adamList);
        float bobSum =aver(bobList);
        float craigSum=aver(craigList);
        float lowest = Math.min(craigSum,(Math.min(adamSum,bobSum)));
        if (lowest==adamSum){
            return "adam";
        } if (lowest==craigSum){
            return "craig";
        } if (lowest==bobSum){
            return "bob";
        }
        return "bob";

    } public static float aver(List<Integer> numsList){
        float sum = 0;
        if (numsList.size() < 2){
            return 99999999;
        }
        for (Integer integer : numsList) {
            sum = sum + integer;
        }
        sum = sum / numsList.size();

        return sum;
    }
}
