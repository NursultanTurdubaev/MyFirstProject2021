package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        //([1, 2, 3, 4, 5, 6, 7]) ➞ "Boom!"
        int [] nums = {5,55,5,5,5,5,77};
        System.out.println(Boom(nums));
        Integer[] arr = {1,2,3,4,5,6,7};
        //List<Integer> arr2 = Convert(arr);
        System.out.println(Boom(arr));

    }
    public static String Boom(int[] nums){
        if (nums[nums.length-1]==7){
            return "Boom";
        }
        return "Oops";
    }

    public static String Boom(Integer[] arr){
        List<Integer> temp =Convert(arr);
        if (temp.get(temp.size()-1)==7){
            return "Boom";
        }
        return "Oops";
    }
    public static List<Integer> Convert(Integer[] arr){

        List<Integer> temp = Arrays.asList(arr);

        return temp;

    }
}
