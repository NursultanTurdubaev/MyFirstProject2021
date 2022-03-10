package codingBat;

import java.util.Arrays;

public class Array3SquareUp {
    public static void main(String[] args) {
//        Given n>=0, create an array length n*n with the following pattern,
//        shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
//        squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
//        squareUp(2) → [0, 1, 2, 1]
//        squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1
        int n = 4;
        System.out.println(Arrays.toString(squareUp(n)));
    }
    public static int[] squareUp(int n){
        int[] result = new int[n*n];
        int decrease = n;
        int count = 1;
        int jumper =0;
        for (int i=result.length-1; i>=0;i--){
            result[i]=count;
            count++;
            if (count==decrease+1){
                count = 1;
                decrease--;
                i=i+jumper;
                jumper++;
            }

        }
        return result;
    }
}
