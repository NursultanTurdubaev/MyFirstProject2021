package interfacesAndAbstractClasses;

public class Maincars  {
    public static void main(String[] args) {
        Toyota camry = new Toyota("black",2010,"2040","camry","sedan" );
        System.out.println(camry);
        Mercedes eshek = new Mercedes("white",2013,"2.5","eshka","sedan");
        System.out.println(eshek);
        System.out.println("camry "+ camry.sound(400,100)+ " hours");

    }
}
