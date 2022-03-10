package methods;

public class ReturnMethods {
    public static void main(String[] args) {
        // multiple(12,56,5);
        ReturnMethods object = new ReturnMethods();
        object.multiple(12, 56, 5);

        System.out.println(multiple2(65, 32, 0));



        }
        public void multiple ( int num, int num2, int num3){
            int result = num * num2 * num3;
            System.out.println(result);
        }
        public static int multiple2 ( int num1, int num2, int num3){
            int result = num1 * num2 * num3;
            return result;
        }

    }
