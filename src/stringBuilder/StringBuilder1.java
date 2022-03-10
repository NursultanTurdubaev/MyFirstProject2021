package stringBuilder;

public class StringBuilder1 {
    public static void main(String[] args) {
        String str = new String("Word");

        // 1
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity());   // 16

        // 2
        StringBuilder sb2 = new StringBuilder(14);
        System.out.println(sb2.capacity());  //14

        // 3
        StringBuilder sb3 = new StringBuilder("Hello!");  // 22 ---> 16+6=22
        System.out.println(sb3.capacity());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

        StringBuilder sb4 = new StringBuilder();
        System.out.println(sb4.capacity());

        sb4.append("1234");
        System.out.println(sb4.capacity());

        sb4.append("123456789012");
        System.out.println(sb4.capacity()); //16
        System.out.println(sb4);

        sb4.append("12345");                          //16  *2 +2 = 34
        System.out.println(sb4.capacity());

        sb4.append("1234567890123456");
        System.out.println(sb4.capacity());

        StringBuilder sb5 = new StringBuilder("Welcome");
        sb5.append(" to bishkek");
        sb5.append(312);
        sb5.append(true);
        System.out.println(sb5.toString());

        String str2 = "Hello";
        String str3 = "World!";
        String concat= str2.concat(str3);
        System.out.println(concat);

        StringBuilder sb6 = new StringBuilder("Java!");

        // insert
        sb6.insert(0, 88);
        System.out.println(sb6);

        // replace
        sb6.replace(0, 3, "Kotlin");
        System.out.println(sb6);

        // reverse()
        StringBuilder sb7 = new StringBuilder("name");
        sb7.reverse();
        System.out.println(sb7);

        // delete()
        StringBuilder sb8 = new StringBuilder("laptop");
        sb8.delete(0,3);
        System.out.println(sb8);

        // deleteCharAt()
        StringBuilder sb9 = new StringBuilder("MacBookPro");
        sb9.deleteCharAt(0);
        System.out.println(sb9);

        // substring(),






    }
}
