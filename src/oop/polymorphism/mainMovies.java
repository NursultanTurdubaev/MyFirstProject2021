package oop.polymorphism;

public class mainMovies {
    public static void main(String[] args) {
        Action badBoys = new Action("Smith", "Drama", "USA",18,1998);
        Action titanic = new Action("DiCaprio", "Drama", "USA",18);
        titanic.setCountry("Kyrgyzstan");
        System.out.println(titanic.getCountry());
        System.out.println(badBoys.getCountry());
    }
}
