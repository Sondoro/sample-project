import java.io.Console;

public class PotLuck {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Welcome to our potluck party registration portal.");
        System.out.println("Kindly enter your first name with the first letter in CAPITAL CASE.");
        String name = console.readLine();

        if (name.startsWith("A")) {
            System.out.println("Great thanks! Your name starts with an A!");
            System.out.println("A for Apples. Kindly carry some apple fruits to the party.");}

        else if (name.startsWith("B")) {
            System.out.println("Great thanks! Your name starts with a B!");
            System.out.println("B for Bananas. Kindly carry some banana fruits to the party.");}

        else if (name.startsWith("G")) {
            System.out.println("Great thanks! Your name starts with a G!");
            System.out.println("G for Green. Green vegetables are on you for our party.");}

        else if (name.startsWith("I")) {
            System.out.println("Great thanks! Your name starts with an I!");
            System.out.println("I for Italy. How about you get us an Italian dish of your choice to the party.");}

        else {
            System.out.println("Wonderful. Do carry any food of your choice for the party.");
        }
    }
}