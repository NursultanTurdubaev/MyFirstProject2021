package switchCaseStatement;

public class Profession {
    public static void main(String[] args) {
        String professional1 = "Finansist";
        String subject = "AE";


        switch (professional1) {
            case "Юрист":
                switch (subject) {
                    case "UPGP":
                        subject = "Ugolovnoe pravo Grajdanskoe Pravo";
                }
                System.out.print(professional1 + " : " + subject);
                break;
            case "Finansist":
                switch (subject){
                    case "AE":
                        subject = "Algebra Economica";
                }
                System.out.println(professional1 + " : " + subject);
                break;
            case "Istoric":
                switch (subject){
                    case "MIOI":
                        subject = "Mir istoria, Otech istoria";
                }
                System.out.println(professional1 + " : " + subject);
        }


    }
}
