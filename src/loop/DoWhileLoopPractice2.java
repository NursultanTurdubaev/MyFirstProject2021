package loop;

public class DoWhileLoopPractice2 {
    public static void main(String[] args) {
        word(3);

    }
    public static void word (int j){
        StringBuilder str = new StringBuilder("Cardi B saing: Okr");
        for (int i=0; i<j; i++){
            str.insert(17,("r"));
        }
        System.out.println(str);

    }
}
