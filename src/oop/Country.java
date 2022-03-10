package oop;

public class Country {
    public static void main(String[] args) {
        Countries kyrgyzstan = new Countries();
        kyrgyzstan.name = "Kyrgyzstan";
        kyrgyzstan.populations = 8000000;
        kyrgyzstan.valuta = "Som";



        System.out.println(kyrgyzstan  + "\n "  + kyrgyzstan.identification());
        Countries russia = new Countries();
        russia.name = "Russia";
        russia.populations = 1400000000;
        russia.valuta = "Rubles";

        System.out.println(russia  + "\n "  + russia.identification());

    }
}

