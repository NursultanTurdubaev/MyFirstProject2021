package oop.inheritance;

public class BlackMouse extends Mouse{

    public String speed;

    public BlackMouse(String color, String texture, String speed) {
        super(color, texture);
        this.speed = speed;
    }

    public BlackMouse(String color, String texture) {
        super(color, texture);
    }

    public String doubleClick(){
        return "Double CLick Click!";
    }

    public  String dragAndDrop(){
        return "Drag And Drop";
    }

}
