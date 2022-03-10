package methods;

public class PracticeClass {
    public static void main(String[] args) {
        System.out.println(jumping1("jump"));

    }

    public static boolean jumping1(String ing) {
        int len = ing.length();
        String bool2 = ing.substring(len - 3);
        if(bool2.equals("ing")){
            return true;

        } else {
            return false;
        }


    }
}
