package interfacesAndAbstractClasses;

public class Mercedes extends Cars implements AllCars{



    public Mercedes(String color, int dateOfManufacture, String engine, String model, String type) {
        super(color, dateOfManufacture, engine, model, type);
    }

    @Override
    public void drive() {

    }

    @Override
    public  String toString() {
        return "Mercedes{" +
                "color='" + color + '\'' +
                ", dateOfManufacture=" + getDateOfManufacture() +
                ", engine='" + engine + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int sound(int distance, int speed) {
        return distance/speed;
    }
}
