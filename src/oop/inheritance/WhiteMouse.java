package oop.inheritance;

public  class WhiteMouse extends BlackMouse{

    public WhiteMouse(String color, String texture) {
        super(color, texture);
    }

    public String navigate(){
        return "Navigate to something";
    }
}
