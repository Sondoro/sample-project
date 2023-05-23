import java.io.Console;

public class Multiply {
    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Multiplication is the name of the geme. Let's have some fun!");
        System.out.println("Give me an integer.");
        String stringNumber1 = myConsole.readLine();

        System.out.println("Great! Give me another integer.");
        String stringNumber2 = myConsole.readLine();

        Integer yourNumber1 = Integer.parseInt(stringNumber1);
        Integer yourNumber2 = Integer.parseInt(stringNumber2);
        Integer multiplicationOfIntegers = yourNumber1 * yourNumber2;

        String stringMultiplicationOfIntegers = Integer.toString(multiplicationOfIntegers);
        System.out.println("Wonderful! " + stringNumber1 + "*" + stringNumber2 + "=" + stringMultiplicationOfIntegers);
    }
}
