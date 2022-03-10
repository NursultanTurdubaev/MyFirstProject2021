package methods;

public class Practice3 {
    public static void main(String[] args) {
        Practice3 object = new Practice3();
        System.out.println(object.ing("jumjhghjgkhjghkkghping"));

    }
    public String ing(String str){
        int length = str.length();
        String str1 = str.substring(length-3);
        return (str1+str1+str1);




    }
}
