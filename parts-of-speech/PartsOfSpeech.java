import java.io.Console;

public class PartsOfSpeech {
    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Give me a noun.");
        String noun = myConsole.readLine();

        System.out.println("Give me an adjective.");
        String adjective = myConsole.readLine();

        System.out.println("I saw the " + noun + " " + adjective +".");
    }
}