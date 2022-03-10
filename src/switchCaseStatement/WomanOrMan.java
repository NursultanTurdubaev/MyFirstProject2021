package switchCaseStatement;

import java.util.Scanner;

public class WomanOrMan {
    public static void main(String[] args) {
        String gender = "gay";
        char sym = 'l';
        switch (gender) {
            case "woman": sym= 'f';
            break;
            case "man": sym= 'm';
            break;
            default:sym= '-';

        }
        System.out.println(sym);
    }
}
