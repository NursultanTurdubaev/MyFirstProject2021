package oop.polymorphism;

public class Poly {
    //Polymorphism
    // 1 type: Overloading ---> same name of the method, but with different parameters.

    public int sum(int n1, int n2){
        return n1+n2;
    }

    public int sum(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int sum(int n1, int num, int num1, int num6){
        return n1+num+num1+num6;
    }
    public double sum(int num){
        return num;
    }

}
