package oop;

public class Animals {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.name = "Mustang";
        horse.age = 17;
        horse.breed = "Ahaltekin";
        System.out.println("Horse: " + horse.name);
        horse.voice();

        Cat kate = new Cat();
        kate.name = "Bubi";
        kate.age = 5;
        kate.breed = "Scotland";
        System.out.println("Name: " + kate.name);
        kate.voice();
        
    }
}
