package interfacesAndAbstractClasses;

public abstract class Cars {
    String color;
    private int dateOfManufacture;
    String engine;
    String model;
    String type;

    public int getDateOfManufacture() {
        return dateOfManufacture;
    }

    public Cars(String color, int dateOfManufacture, String engine, String model, String type) {
        this.color = color;
        this.dateOfManufacture = dateOfManufacture;
        this.engine = engine;
        this.model = model;
        this.type = type;

    }
    public abstract void drive();


}
