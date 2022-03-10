package homeworks;

public class HomeWork44 {
    public static void main(String[] args) {
        int mark = 55;
        System.out.println("The mark is " + mark);

        PassOrFail(mark);

    }
    public static void PassOrFail(int mark){

      if ( mark < 50 ) {
        System.out.println( "You failed!" );
    } else {
        System.out.println( "You passed" );
    }

}

}
