package oop.inheritance;

public class MainLapTop {
    public static void main(String[] args) {


        Lenovo a = new Lenovo("acer", "lg", "apple", "intel");


        MacBook mac = new MacBook("acer", "samsung", "panasonic", "AMD","webCam");


        System.out.println(mac + " \n"+ mac.getWebCam() + "\n " +  mac.install() +"\n "  +  mac.chat() );


    }
}
