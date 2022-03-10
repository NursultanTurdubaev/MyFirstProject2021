package oop.inheritance;

public class MainMouse {
    public static void main(String[] args) {

        Mouse mouse1 = new Mouse("Green", "Matte");
        mouse1.setColor("red");
        System.out.println("From mouse1 - " + mouse1.click() + "Object " + mouse1);
        System.out.println();

        BlackMouse blackMouse = new BlackMouse("black", "plastic");
        System.out.println("From blackMouse - " + blackMouse.doubleClick());

        Mouse mouse2 = new BlackMouse("blue", "metal");
        System.out.println("From mouse2 - " + mouse2.scrollDown());

        WhiteMouse whiteMouse = new WhiteMouse("yellow", "matte");
        whiteMouse.dragAndDrop();
        whiteMouse.navigate();

        BlackMouse mouse3 = new WhiteMouse("pink", "plastic");

        Mouse mouse4 = new WhiteMouse("Brown", "Plastic");

        Mouse mouse5 = new Mouse("pink", "metal");

        BlackMouse mouse6 = new BlackMouse("Gray", "metal");

        BlackMouse mouse7 = new BlackMouse("Yellow", "plastic", "slowly");


    }
}
