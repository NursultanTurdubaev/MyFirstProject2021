package homeworks;


import java.text.DecimalFormat;

public class HomeWork14 {
    public static void main(String[] args) {
        double Radius=7.5;
        double Perimeter=2*(Radius*3.14);
        double Area=3.14*(Radius*Radius);
        DecimalFormat dec = new DecimalFormat("#0.00000000000000");
        System.out.println("Perimeter is = "+ dec.format(Perimeter));
        System.out.println("Area is = "+ dec.format(Area));

    }
}
