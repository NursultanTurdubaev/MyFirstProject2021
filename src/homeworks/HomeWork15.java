package homeworks;

public class HomeWork15 {
    public static void main(String[] args) {
        int m=25;
        int n, sum =0;
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("The sum of the digits is: "+sum);



    }
}
