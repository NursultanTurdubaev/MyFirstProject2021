package homeworks;

import java.text.DecimalFormat;

public class HomeWork13 {
    public static void main(String[] args) {
        float Width= 5.60f;
        float Height=8.50f;
        DecimalFormat dec = new DecimalFormat("#0.00");
        System.out.println("Area is "+Width+" * "+Height+" = "+ dec.format(Width*Height));
        System.out.println("Perimeter is "+"2*("+Width+" + "+Height+") = "+dec.format(2*(Width+Height)));

    }
}
