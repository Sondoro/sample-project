import java.io.Console;

public class DrinkingAge {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("How old are you?");
        String stringUserAge = console.readLine();
        Integer integerUserAge = Integer.parseInt(stringUserAge);

        if (integerUserAge >= 18) {
            System.out.println("You can drink alcohol legally!");
        } else {
            System.out.println("I'm sorry, you are too young to drink alcohol.");
        }
    }
}