import java.io.Console;
public class App {

    public static void main(String[] args) {
        Console myConsole = System.console();

        Animal dog1 = new Animal("Dog", "German Shepherd", "Black and Tan", "1 Year");
        Animal dog2 = new Animal("Dog", "Chihuahua", "Fawn", "7 Months");
        Animal dog3 = new Animal("Dog", "Rottweiler", "Black and Gold", "11 Months");
        Animal dog4 = new Animal("Dog", "Bulldog", "Grey", "2 Years");
        Animal cat1 = new Animal("Cat", "Siamese", "White and Grey", "6 Months");
        Animal cat2 = new Animal("Cat", "Abyssinian", "Brown", "1 Year");
        Animal cat3 = new Animal("Cat", "Persian", "Gold", "8 Months");
        Animal cat4 = new Animal("Cat", "American Bobtail", "Lilac", "18 Months");

        Animal[] allAnimals = { dog1, dog2, dog3, dog4, cat1, cat2, cat3, cat4 };

        System.out.println("What type of pet are you interested in?");
        String stringMyPetType = myConsole.readLine();

        System.out.println("-----------------------------");

        System.out.println("Alright, here's what we have for you:");

        for ( Animal individualAnimal : allAnimals ) {
          if (individualAnimal.myPet(stringMyPetType)){
              System.out.println("-----------------------------");
              System.out.println(individualAnimal.mSpecies);
              System.out.println(individualAnimal.mBreed);
              System.out.println(individualAnimal.mColor);
              System.out.println(individualAnimal.mAge);
          }
        }
    }
}


// THE ORIGINAL CODE BEFORE REFACTOR USING OUR CUSTOM CONSTRUCTOR METHOD Animal IN OUR Animal.java file

//import java.io.Console;
//public class App {
//
//    public static void main(String[] args) {
//        Console myConsole = System.console();
//
//        Animal dog1 = new Animal();
//        dog1.mSpecies = "Dog";
//        dog1.mBreed = "German Shepherd";
//        dog1.mColor = "Black and Tan";
//        dog1.mAge = "1 Year";
//
//        Animal dog2 = new Animal();
//        dog2.mSpecies = "Dog";
//        dog2.mBreed = "Chihuahua";
//        dog2.mColor = "Fawn";
//        dog2.mAge = "7 Months";
//
//        Animal dog3 = new Animal();
//        dog3.mSpecies = "Dog";
//        dog3.mBreed = "Rottweiler";
//        dog3.mColor = "Black and Gold";
//        dog3.mAge = "11 Months";
//
//        Animal dog4 = new Animal();
//        dog4.mSpecies = "Dog";
//        dog4.mBreed = "Bulldog";
//        dog4.mColor = "Grey";
//        dog4.mAge = "2 Years";
//
//        Animal cat1 = new Animal();
//        cat1.mSpecies = "Cat";
//        cat1.mBreed = "Siamese";
//        cat1.mColor = "White and Grey";
//        cat1.mAge = "6 Months";
//
//        Animal cat2 = new Animal();
//        cat2.mSpecies = "Cat";
//        cat2.mBreed = "Abyssinian";
//        cat2.mColor = "Brown";
//        cat2.mAge = "1 Year";
//
//        Animal cat3 = new Animal();
//        cat3.mSpecies = "Cat";
//        cat3.mBreed = "Persian";
//        cat3.mColor = "Gold";
//        cat3.mAge = "8 Months";
//
//        Animal cat4 = new Animal();
//        cat4.mSpecies = "Cat";
//        cat4.mBreed = "American Bobtail";
//        cat4.mColor = "Lilac";
//        cat4.mAge = "18 Months";
//
//        Animal[] allAnimals = { dog1, dog2, dog3, dog4, cat1, cat2, cat3, cat4 };
//
//        System.out.println("What type of pet are you interested in?");
//        String stringMyPetType = myConsole.readLine();
//
//        System.out.println("-----------------------------");
//
//        System.out.println("Alright, here's what we have for you:");
//
//        for ( Animal individualAnimal : allAnimals ) {
//            if (individualAnimal.myPet(stringMyPetType)){
//                System.out.println("-----------------------------");
//                System.out.println(individualAnimal.mSpecies);
//                System.out.println(individualAnimal.mBreed);
//                System.out.println(individualAnimal.mColor);
//                System.out.println(individualAnimal.mAge);
//            }
//        }
//    }
//}