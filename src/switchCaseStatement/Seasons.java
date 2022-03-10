package switchCaseStatement;

public class Seasons {
    public static void main(String[] args) {
        String nameOfMonth = "April";
        int number = 0;
        switch (nameOfMonth){
            case "December":
            case "January" :
            case "February":
                     number = 1;
                     break;
            case "March":
            case "April" :
            case "May":
                number = 2;
                break;
            case "June":
            case "July" :
            case "August":
                number = 3;
                break;
            case "September":
            case "October" :
            case "November":
                number = 4;
                break;
            default:
                number = 100;
                System.out.println("Invalid number");
        }
        System.out.println(number);
    }
}
