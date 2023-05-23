import java.io.BufferedReader;
import java.util.ArrayList;
import java.io.IOException;
import java.util.InputStreamReader;

public class App {
    public static void main(String[] args) {

        boolean programRunning = true;

        Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
        Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
        Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
        Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
        Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);

        ArrayList<Vehicle> allVehicles = new ArrayList<Vehicle>();
        allVehicles.add(hatchback);
        allVehicles.add(suv);
        allVehicles.add(sedan);
        allVehicles.add(truck);
        allVehicles.add(crossover);

        while(programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new inputStreamReader(System.in));
            System.out.println("Welcome to our car dealership. What would you like to do? " +
                    "Enter one of the following options: All Vehicles, Search Price, Add Vehicle or Exit");

            try {
            String navigationChoice = bufferedReader.readLine();

            if (navigationChoice.equals("All Vehicles")) {
                System.out.println("-----------------------------");
                for (Vehicle individualVehicle : allVehicles) {
                    System.out.println(individualVehicle.getYear());
                    System.out.println(individualVehicle.getBrand());
                    System.out.println(individualVehicle.getModel());
                    System.out.println(individualVehicle.getMiles());
                    System.out.println(individualVehicle.getPrice());
                    System.out.println("-----------------------------");
                }
            } else if (navigationChoice.equals("Search Price")) {
                System.out.println("What is your maximum budget for a vehicle?");
                String stringUserMaxBudget = bufferedReader.readLine();
                int userMaxBudget = Integer.parseInt(stringUserMaxBudget);

                System.out.println("-----------------------------");

                System.out.println("Alright, here's what we have in your price range:");
                System.out.println("-------------------------------------------------");

                for (Vehicle individualVehicle : allVehicles) {
                    if (individualVehicle.worthBuying(userMaxBudget)) {
                        System.out.println(individualVehicle.getYear());
                        System.out.println(individualVehicle.getBrand());
                        System.out.println(individualVehicle.getModel());
                        System.out.println(individualVehicle.getMiles());
                        System.out.println(individualVehicle.getPrice());
                        System.out.println("-----------------------------");
                    }
                }
            } else if (navigationChoice.equals("Add Vehicle")) {
                System.out.println("Alright, let's add a vehicle! What getYear() was this vehicle made?");
                int userVehicleYear = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Great! What make or getBrand() is the vehicle?");
                String userVehicleBrand = bufferedReader.readLine();
                System.out.println("Got it! What getModel() is it?");
                String userVehicleModel = bufferedReader.readLine();
                System.out.println("And how many getMiles() does it have on it?");
                int userVehicleMiles = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Finally, what's its getPrice()?");
                int userVehiclePrice = Integer.parseInt(bufferedReader.readLine());

                System.out.println("---------------------------------");

                Vehicle userVehicle = new Vehicle(userVehicleYear, userVehicleBrand, userVehicleModel, userVehicleMiles, userVehiclePrice);
                allVehicles.add(userVehicle);

                System.out.println("Alright, here's your new vehicle:");
                System.out.println("---------------------------------");
                System.out.println(userVehicle.getYear());
                System.out.println(userVehicle.getBrand());
                System.out.println(userVehicle.getModel());
                System.out.println(userVehicle.getMiles());
                System.out.println(userVehicle.getPrice());
                System.out.println("---------------------------------");

            } else if (navigationChoice.equals("Exit")) {
                System.out.println("Goodbye!");
                programRunning = false;

            } else {
                System.out.println("I'm sorry, we don't recognize your input");
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
      }
   }
}


// NOTES (SECTION (A.), (B.)

// (A.)THE ORIGINAL CODE BEFORE REFACTOR USING OUR CUSTOM CONSTRUCTOR METHOD Vehicle IN OUR Vehicle.java file

//import java.io.Console;
//
//public class App {
//    public static void main(String[] args) {
//        Console myConsole = System.console();
//
//        Vehicle hatchback = new Vehicle();
//        hatchback.mYear = 1994;
//        hatchback.mBrand = "Subaru";
//        hatchback.mModel = "Legacy";
//        hatchback.mMiles = 170000;
//        hatchback.mPrice = 4000;
//
//        Vehicle suv = new Vehicle();
//        suv.mYear = 2002;
//        suv.mBrand = "Ford";
//        suv.mModel = "Explorer";
//        suv.mMiles = 100000;
//        suv.mPrice = 7000;
//
//        Vehicle sedan = new Vehicle();
//        sedan.mYear = 2015;
//        sedan.mBrand = "Toyota";
//        sedan.mModel = "Camry";
//        sedan.mMiles = 50000;
//        sedan.mPrice = 30000;
//
//        Vehicle truck = new Vehicle();
//        truck.mYear = 1999;
//        truck.mBrand = "Ford";
//        truck.mModel = "Ranger";
//        truck.mMiles = 100000;
//        truck.mPrice = 4000;
//
//        Vehicle crossover = new Vehicle();
//        crossover.mYear = 1998;
//        crossover.mBrand = "Toyota";
//        crossover.mModel = "Rav-4";
//        crossover.mMiles = 200000;
//        crossover.mPrice = 3500;
//
//
//        Vehicle[] allVehicles = {hatchback, suv, sedan, truck, crossover};
//
//        System.out.println("What is your maximum budget for a vehicle?");
//        String stringUserMaxBudget = myConsole.readLine();
//        int userMaxBudget = Integer.parseInt(stringUserMaxBudget);
//
//        System.out.println("-----------------------------");
//
//        System.out.println("Alright, here's what we have in your price range:");
//
//        for ( Vehicle individualVehicle : allVehicles ) {
//            if (individualVehicle.worthBuying(userMaxBudget)){
//                System.out.println("-----------------------------");
//                System.out.println( individualVehicle.mYear );
//                System.out.println( individualVehicle.mBrand );
//                System.out.println( individualVehicle.mModel );
//                System.out.println( individualVehicle.mMiles );
//                System.out.println( individualVehicle.mPrice );
//
//            }
//        }
//    }
//}




//(B.) CODE REFACTOR USING OUR CUSTOM CONSTRUCTOR METHOD Vehicle IN OUR Vehicle.java file

//import java.io.Console;
//
//public class App {
//    public static void main(String[] args) {
//        Console myConsole = System.console();
//
//        Vehicle hatchback = new Vehicle(1994, "Subaru", "Legacy", 170000, 4000);
//        Vehicle suv = new Vehicle(2002, "Ford", "Explorer", 100000, 7000);
//        Vehicle sedan = new Vehicle(2015, "Toyota", "Camry", 50000, 30000);
//        Vehicle truck = new Vehicle(1999, "Ford", "Ranger", 100000, 4000);
//        Vehicle crossover = new Vehicle(1998, "Toyota", "Rav-4", 200000, 3500);
//
//        Vehicle[] allVehicles = {hatchback, suv, sedan, truck, crossover};
//
//        System.out.println("What is your maximum budget for a vehicle?");
//        String stringUserMaxBudget = myConsole.readLine();
//        int userMaxBudget = Integer.parseInt(stringUserMaxBudget);
//
//        System.out.println("-----------------------------");
//
//        System.out.println("Alright, here's what we have in your price range:");
//
//        for ( Vehicle individualVehicle : allVehicles ) {
//            if (individualVehicle.worthBuying(userMaxBudget)){
//                System.out.println("-----------------------------");
//                System.out.println( individualVehicle.mYear );
//                System.out.println( individualVehicle.mBrand );
//                System.out.println( individualVehicle.mModel );
//                System.out.println( individualVehicle.mMiles );
//                System.out.println( individualVehicle.mPrice );
//
//            }
//        }
//    }
//}