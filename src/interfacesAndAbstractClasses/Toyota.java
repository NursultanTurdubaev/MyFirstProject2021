package interfacesAndAbstractClasses;

public class  Toyota extends Cars implements AllCars {

    public Toyota(String color, int dateOfManufacture, String engine, String model, String type) {
        super(color, dateOfManufacture, engine, model, type);
    }


    @Override
    public void drive() {
        System.out.println("brrrrrrrrrrr");
    }
    @Override
    public  String toString() {
        return "Toyota{" +
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
