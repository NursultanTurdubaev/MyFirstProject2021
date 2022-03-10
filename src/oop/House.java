package oop;

public class House {
    public int floor;
    public double area;
    public String window;
    public String color;
    public String material;

    public House(int floor, double area, String window, String color, String material) {
        this.floor = floor;
        this.area = area;
        this.window = window;
        this.color = color;
        this.material = material;
    }
    public String toWarm (){
        return "Согревать";
    }
    public String relax(){
        return "дом миый дом ";
    }

    @Override
    public String toString() {
        return "House{" +
                "floor=" + floor +
                ", area=" + area +
                ", window='" + window + '\'' +
                ", color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
