package arrayList;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        Float [][] f1 = new Float[2][3];
        f1[0][0] = 10.1f;
        f1[0][1] = 10.2f;
        f1[0][2] = 10.3f;
        f1[1][0] = 11.1f;
        f1[1][1] = 11.2f;
        System.out.println(Arrays.deepToString(f1));
        System.out.println(convert(f1[1]));




        //Iterator blablabla = f1.iterator();

    }
    public static List <Float> convert(Float[] f2){
        List<Float> f3 = Arrays.asList(f2);

        return f3;
    }
}
