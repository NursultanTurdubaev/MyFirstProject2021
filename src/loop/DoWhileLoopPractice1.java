package loop;

public class DoWhileLoopPractice1 {
    public static void main(String[] args) {
//        Cardi B saing: Okr —> Cardi B saing: Okrrr
       DoWhileLoopPractice1  object = new DoWhileLoopPractice1();
       object.ll();
        System.out.println(object.ll());
    }
    public StringBuilder ll(){
        StringBuilder l = new StringBuilder("Cardi B saing: Okr");
        l.insert(17,("rrr"));
        return l;
    }

}
