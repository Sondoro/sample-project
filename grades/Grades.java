import java.io.Console;

public class Grades {
    public static void main (String[] args) {
        Console console = System.console();

        System.out.println("Please enter your overall grade in the last class (A, B, C, D or F)");
        String grade = console.readLine();

        boolean exceptional = grade.equals("A");
        boolean excellent = grade.equals("B");
        boolean good = grade.equals("C");
        boolean inconsistent = grade.equals("D");
        boolean poor = grade.equals("F");


        if ( exceptional || excellent ) {
            System.out.println("Stellar performance. You are now ready to graduate to the next class.");
            System.out.println("You have also been nominated for the Top Performer Awards. Congratulations!");
        } else if ( good ) {
            System.out.println("Good performance. You are now ready to graduate to the next class.");
        } else if ( inconsistent || poor ) {
            System.out.println("Your performance was below average and you are due for exam retake.");
            System.out.println("Please visit the exams office to book your supplimentary exam date.");
            System.out.println("Best wishes.");
        } else {
            System.out.println("Kindly enter the correct grade.");
        }
    }
}