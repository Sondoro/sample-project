import java.io.Console;

public class Subtraction {
    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Let's have some subtraction fun!. Give me an integer.");
        String stringNumber1 = myConsole.readLine();

        System.out.println("Great! Give me another integer.");
        String stringNumber2 = myConsole.readLine();

        Integer yourNumber1 = Integer.parseInt(stringNumber1);
        Integer yourNumber2 = Integer.parseInt(stringNumber2);
        Integer subtractionOfIntegers = yourNumber1 - yourNumber2;

        String stringSubtractionOfIntegers = Integer.toString(subtractionOfIntegers);
        System.out.println("Wonderful! " + stringNumber1 + "-" + stringNumber2 + "=" + stringSubtractionOfIntegers);
    }
}
