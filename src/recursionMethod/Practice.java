package recursionMethod;

public class Practice {
    public static void main(String[] args) {
        decrease(5);
    }
    private static void decrease(int x){
        System.out.println(x);
        if (x==0){
            return ;
        }

        decrease(x-1);// 5 4 3 2 1 0
    }
}
