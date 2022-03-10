package strings;

public class UsualString {
    public static void main(String[] args) {
        String str = "NewString";
        str.toUpperCase();
        // str = "klsfjlkj";
        System.out.println(str);

        String str2 = new String("NewString");
        str2.toUpperCase();
        System.out.printf(str2.toUpperCase());

        System.out.println(str==str2);

    }
}
