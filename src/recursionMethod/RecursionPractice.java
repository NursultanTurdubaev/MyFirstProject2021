package recursionMethod;

public class RecursionPractice {
    public static void main(String[] args) {
        counter(3);
    }
    private static void counter(int nums){

        if (nums ==0){
            return;
        }
        System.out.println(nums);
        counter(nums-1);
    }
}
