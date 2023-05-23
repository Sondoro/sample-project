import java.io.Console;

public class EvenOdd {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Please enter a number");
        String stringNumber = console.readLine();
        Integer myNumber = Integer.parseInt(stringNumber);

        System.out.println("See below even and odd numbers between 1 and your number of choice:");

        for ( Integer number = 1 ; number <= myNumber ; number++) {
            if ( number % 2 == 0) {
                System.out.println( number + " is an even number." );
            } else  {
                System.out.println( number + " is an odd number." );
            }
        }
    }
}