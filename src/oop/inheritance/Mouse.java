package oop.inheritance;

public class Mouse {
    // fields
    private String color;
    private String texture;


    public Mouse(String color, String texture) {
        this.color = color;
        this.texture = texture;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }



    public String click(){
        return "Click";
    }

    public String rightClick(){
        return "Right click";
    }

    public String scrollUp(){
        return "ScrollUp";
    }

    public String scrollDown(){
        return "Scroll down";
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "color='" + color + '\'' +
                ", texture='" + texture + '\'' +
                '}';
    }
}
