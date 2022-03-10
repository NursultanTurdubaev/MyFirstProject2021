package ifElseLesson;

public class IfElse {
    public static void main(String[] args) {
        int age = 79;
        // 17< 18 ---> true
        // 17 > 18 ----> false
        if (age < 18) {
            System.out.println("You can not watch the horror movie");

        } else if (age >=78){
            System.err.println("Attention! It is dangerous for your life");
        }
        else {
            System.out.println("You can watch the horror movie");
        }
    }
}
