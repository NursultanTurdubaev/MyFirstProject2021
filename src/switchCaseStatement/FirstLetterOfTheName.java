package switchCaseStatement;

public class FirstLetterOfTheName {
    public static void main(String[] args) {
        String name = "";
        char firstLetter = 'A';
        switch (firstLetter){
            case 'A' : name = "Aidar";
            break;
            case 'M' : name = "Marsel";
            break;
            default: name = "no name";

        }
        System.out.println(name);


        // Optional -> else, default, break
        // redundant -> ne nujniy kod
        // switch --> byte, short, int, char, String, long

        int mark = 5;
        String mess = "";
        String exam = "Great job!";
        switch (mark){
            case 2: mess = "Sorry!";
            break;
            case 3: mess = "SORRY!";
            break;
            case 4: case 5:
                switch (exam){
                    case "Great job!" :
                        System.out.print("Success ");
                }
        }
        System.out.println(exam);

    }
}
