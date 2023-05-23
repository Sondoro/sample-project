import java.io.Console;

public class StartsWithZ {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("What's your name?");
        String userName = console.readLine();

        if (userName.startsWith("Z")) {
            System.out.println("Your name starts with a Z!");
        } else {
            System.out.println("Your name doesn't start with a Z :(");
        }
    }
}