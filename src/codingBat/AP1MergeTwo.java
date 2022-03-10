package codingBat;

import java.util.Arrays;

public class AP1MergeTwo {
    public static void main(String[] args) {
//        Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
//        Return a new array containing the first N elements from the two arrays.
//        The result array should be in alphabetical order and without duplicates.
//        A and B will both have a length which is N or more.
//        The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order,
//        copying elements directly to the new array.
//        mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) → ["a", "b", "c"]
//        mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) → ["a", "c", "f"]
//        mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) → ["c", "f", "g"]
        String[] a = {"a", "c", "z"};
        String[] b = {"b", "f", "z"};
        int n = 3;
        System.out.println(Arrays.toString(mergeTwo(a, b, n)));
    }
    public static String[] mergeTwo(String[] a, String[] b, int n) {
        String[] fin = new String[n];
        int temp = 0;
        for (int i =0; i<a.length;i++){
            fin[temp]= first(a[i],b[i]);
            temp++;
            if (temp==n){
                break;
            }
            fin[temp] = second(a[i],b[i]);
            temp++;
        }return fin;
    }
    public static String first(String str, String str2){
        int temp = str.compareTo(str2);
        if (temp<0){
            return str;
        }
        if (temp>0){
            return str2;
        }
        return str;
    }
    public static String second(String str, String str2){
        int temp = str.compareTo(str2);
        if (temp<0){
            return str2;
        }
        if (temp>0){
            return str;
        }
        return str2;
    }
}
