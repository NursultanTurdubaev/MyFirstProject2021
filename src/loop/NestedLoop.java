package loop;

public class NestedLoop {
    public static void main(String[] args) {
        byte num1 = 18;
        int num2 = num1;
        if (num1 <= num2) {
            System.out.println(num1);
            if (num1 == num2) {
                System.out.println(num2);
            }
        }
        int weeks = 2;
        int day = 7;
        for (int i = 1; i <= weeks; i++) {
            System.out.println("Week: " + i);
            for (int j = 1; j <= day; j++) {
                System.out.println(" - Days: " + j);
            }
        }
    }
}
