package loop;

public class Practice {
    public static void main(String[] args) {
        int[][] multiplyTab = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplyTab[i][j] = (i + 1) * (j + 1);
                System.out.printf("%7d", multiplyTab[i][j]);
            }
            System.out.println();
        }
        for (int i =0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%5d", (i + 1) * (j + 1));
            }
            System.out.println();
        }

            }
}
