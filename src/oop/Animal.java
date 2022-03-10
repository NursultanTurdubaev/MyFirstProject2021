package oop;

public class Animal {
    // Instance variables
    // fields
    // Class attributes
    final public  String name = "John";
    private int age;
    protected String color;


    // Getter & Setter --> Encapsulation
    public int getAge() {
        return age;
    }

    // Special method
    // Constructor.
    // Constructor is special method --> constructor name must match  with class name
    // 1) Default constructor
    // 2) Constructor wit parameters
    public Animal( int age, String color) {

        this.age = age;
        this.color = color;
    }

    public String voice(){
        return "Some voice";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
