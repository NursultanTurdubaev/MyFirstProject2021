package oop;

public class MainAnimal {
    public static void main(String[] args) {
        Animal cat = new Animal( 3, "gray");
        System.out.println(cat);
        System.out.println(cat.getAge());
//        cat.setAge(6);
        System.out.println(cat);
        System.out.println(cat.getAge());



        Animal dog = new Animal(5, "black");
        System.out.println(dog);

        String str = "Hello";
        str = "world";



        // Access modifiers:
        // 1) public 2)private 3)Protected 4)default
    }

}







