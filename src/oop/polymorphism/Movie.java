package oop.polymorphism;

public class Movie {
    public String actor;
    public String genre;
    private String country;
    public int ageRestriction;

    public Movie(String actor, String genre, String country, int ageRestriction) {
        this.actor = actor;
        this.genre = genre;
        this.country = country;
        this.ageRestriction = ageRestriction;

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor='" + actor + '\'' +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", age restriction='" + ageRestriction + '\'' +
                '}';
    }

    public void evokeEmotions(String emotion1, String emotion2){

        System.out.println("Evokes "+ emotion1 + ", "+ emotion2);
    }
    public void evokeEmotions(String emotion1, String emotion2, String emotion3){

        System.out.println("Evokes "+ emotion1 + ", "+ emotion2 + ", "+ emotion3);
    }
    public void show(){

        System.out.println("Show something!");
    }
}
