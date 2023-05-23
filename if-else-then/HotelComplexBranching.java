import java.io.Console;

public class HotelComplexBranching {
    public static void main (String[] args) {
       Console console = System.console();

       System.out.println("In what season are you booking a stay?");
       String season = console.readLine();

       System.out.println("On the weekend, or a weeknight?");
       String dayOfWeek = console.readLine();

       boolean summer = season.equals("summer");
       boolean weekend = dayOfWeek.equals("weekend");

       if ( summer && weekend ) {
        System.out.println("Your stay is probably going to be pretty expensive. It's both peak travel season AND the weekend.");
        } else if ( summer ) {
           System.out.println("Your stay is probably going to be pretty expensive.");
       } else if ( weekend ) {
           System.out.println("Your stay is probably going to be pretty expensive.");
       } else {
           System.out.println("Your stay may be costly, but it could certainly be worse!");
       }
    }
}