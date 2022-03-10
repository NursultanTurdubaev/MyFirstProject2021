package oop.inheritance;

public class MacBook extends  Lenovo{

    private String webCam;

    public MacBook(String keyboard, String monitor, String touchpad, String processor,String webCam) {

        super(keyboard, monitor, touchpad, processor);
        this.webCam = webCam;
    }
    public String install(){
        return "install";
    }

    public String chat(){
        return "chat";
    }

    public String getWebCam() {
        return webCam;
    }

    public void setWebCam(String webCam) {
        this.webCam = webCam;
    }
}