package oop;

public class Dog {
    // Instance variables
    String name;
    int age;
    String breed;
    String color;

    public  void eat(){
        System.out.println("Omnom nom nom! MMM Yummy");
    }

    public void bark(){
        System.out.println("Gav-gav");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Ak-Tosh";
        myDog.age = 3;
        myDog.breed = "Kandek";
        myDog.color = "White";
        System.out.println("Name: " + myDog.name + " Age: " + myDog.age + " Bread: " + myDog.breed + " Color: " + myDog.color);
        System.out.println(myDog.age);
        myDog.bark();
        myDog.eat();

        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.reverse();
        System.out.println(sb);

    }

}

