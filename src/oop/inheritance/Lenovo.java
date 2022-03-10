package oop.inheritance;

public class Lenovo extends LapTop {
    String headSet;


    public Lenovo(String keyboard, String monitor, String touchpad, String processor) {
        super(keyboard, monitor, touchpad, processor);
    }
    public String play(){
        return "play";
    }
    public String watch(){
        return "watch";
    }
}