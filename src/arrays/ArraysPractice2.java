package arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        // Get last number from an array
        ArraysPractice2 object = new ArraysPractice2();
        int [] arr= {5,4,3,9};
        System.out.println(object.sum3(arr));
    }
    public int sum3 (int[] result) {
        if (result.length > 0) {
            return result[result.length - 1];

        }
        return 0;
    }
}
