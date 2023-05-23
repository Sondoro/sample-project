import java.io.Console;

public class TwoDigits {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Enter a two digit number");
        String stringNumber = console.readLine();
        Integer integerNumber = Integer.parseInt(stringNumber);

        if (integerNumber >= 10 && integerNumber <=99) {
            System.out.println("Great! You have entered a two digit number");
        } else {
            System.out.println("I'm sorry, you have not entered a two digit number.");
        }
    }
}