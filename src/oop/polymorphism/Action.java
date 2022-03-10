package oop.polymorphism;

public class Action extends Movie {
    public int productionYear;

    private String actor;


    public Action(String actor, String genre, String country, int ageRestriction) {
        super(actor, genre, country, ageRestriction);
    }

    public Action(String actor, String genre, String country, int ageRestriction, int productionYear) {
        super(actor, genre, country, ageRestriction);
        this.productionYear = productionYear;
    }
}
