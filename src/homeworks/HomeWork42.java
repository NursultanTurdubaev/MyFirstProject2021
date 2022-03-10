package homeworks;

public class HomeWork42 {
    public static void main(String[] args) {
        HomeWork42 calculator = new HomeWork42();
        System.out.println(calculator.add(21,3));
        System.out.println(calculator.divide(21,3));
        System.out.println(calculator.substrac(21,3));
        System.out.println(calculator.multiply(21,3));


    }
    public int add (int a, int b){
        return a+b;
    }
    public int divide (int a, int b){ return a/b;}
    public int substrac (int a, int b){ return a-b;}
    public int multiply (int a, int b){ return a*b;}
}
