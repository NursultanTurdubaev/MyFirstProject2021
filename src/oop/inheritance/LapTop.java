package oop.inheritance;

public class LapTop {
    String keyboard;
    String monitor;
    String touchpad;
    String processor;

    public String calculate(){
        return "calculate";
    }

    public String type(){
        return "type";
    }

    public String show(){
        return "show";
    }

    public LapTop(String keyboard, String monitor, String touchpad, String processor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.touchpad = touchpad;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "keyboard='" + keyboard + '\'' +
                ", monitor='" + monitor + '\'' +
                ", touchpad='" + touchpad + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}