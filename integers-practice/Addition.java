import java.io.Console;

public class Addition {
    public static void main(String[] args) {
        Console myConsole = System.console();

        System.out.println("Give me an integer");
        String stringNumber1 = myConsole.readLine();

        System.out.println("Give me another integer");
        String stringNumber2 = myConsole.readLine();

        Integer yourNumber1 = Integer.parseInt(stringNumber1);
        Integer yourNumber2 = Integer.parseInt(stringNumber2);
        Integer sumOfIntegers = yourNumber1 + yourNumber2;

        String stringSumOfIntegers = Integer.toString(sumOfIntegers);
        System.out.println("The sum of your two integers is: " + stringSumOfIntegers);

    }
}