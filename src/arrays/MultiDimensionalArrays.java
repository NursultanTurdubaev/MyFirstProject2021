package arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int arr [][] = new int[2][2];
        arr[0][0] = 10;
        arr[0][1]= 20;
        arr[1][0]= 100;
        arr[1][1]= 200;

        int [][] arr2= {{10,20}, {100,200}};
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.deepToString(arr2)); // deepToString is used for returning
        // the array values instead of toString

        System.out.println(arr2[1][1]);
        int [] num = {1,2,3};
        System.out.println(num[0]);

        int arr3 [][] = new int [2][3];
        arr3[0][0] = 10;
        arr3[0][1]= 20;
        arr3[1][0]= 100;
        arr3[1][1]= 200;
        arr3[1][2] = 300;
        System.out.println(Arrays.deepToString(arr3));

        // Jagged array
        int [][] arr5 = {{1,2}, {1,2,3,4}, {0}, {5,6}}; // [][] means it can have any number of elements inside
        System.out.println(Arrays.deepToString(arr5));

        int count = 0;
        for (int i =0; i<arr5.length; i++){
            for (int j = 0; j<arr5[i].length; j++){
                //arr5[i][j] = count++;
                System.out.print(arr5[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
