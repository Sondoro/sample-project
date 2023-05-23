import java.io.Console;

public class Divide {
    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Let's dive into some division and have some fun while at it!");
        System.out.println("Give me an integer.");
        String stringNumber1 = myConsole.readLine();

        System.out.println("Great! Give me another integer.");
        String stringNumber2 = myConsole.readLine();

        Integer yourNumber1 = Integer.parseInt(stringNumber1);
        Integer yourNumber2 = Integer.parseInt(stringNumber2);
        Integer divisionOfIntegers = yourNumber1 / yourNumber2;

        String stringDivisionOfIntegers = Integer.toString(divisionOfIntegers);
        System.out.println("Super cool! " + stringNumber1 + "/" + stringNumber2 + " = " + stringDivisionOfIntegers);
    }
}
