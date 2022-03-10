package loop;

public class ForLoop3 {
    public static void main(String[] args) {
        int num = 9;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd " + i);
            } else {
                System.out.println("Even " + i);
            }
        }
    }
}
