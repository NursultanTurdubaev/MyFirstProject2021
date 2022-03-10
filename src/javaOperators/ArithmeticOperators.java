package javaOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // increment ++
        // decrement --
        // prefix ++num or variable
        int num = 1; //1

        ++num; //2

        int res = ++num; //3
        System.out.println(++res); // 4
        // postfix num++
        int num1 = 1; // 1
        num1++; //2
        int res2 = num1++; // 2
        System.out.println(res2++); //2
        System.out.println(res2++); //3
        System.out.println(res2++); //4
        System.out.println(++res2);
           int variable = 10;
    }
}
