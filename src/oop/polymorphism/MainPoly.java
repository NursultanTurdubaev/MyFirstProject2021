package oop.polymorphism;

public class MainPoly {
    public static void main(String[] args) {
        Poly poly = new Poly();
        System.out.println(poly.sum(9,5));
        System.out.println(poly.sum(5,8,2));
        System.out.println(poly.sum(1,2,3,4));
        System.out.println(poly.sum(7));

        PolySecondType polySecondType = new PolySecondType();
        polySecondType.voice();

        SecondType secondType = new SecondType();
        secondType.voice();
        // Polymorphism
        // Overloading --> same name but different parameters
        // Overriding --> same name but different implementations
        // Constructor --> constructor can be overloaded too
        Person person = new Person("Brad",67);
        Person person1 = new Person("Nick");
        Person person2 = new Person(24);
    }
}
