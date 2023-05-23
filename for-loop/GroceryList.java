public class GroceryList {
    public static void main(String[] args) {
        String[] myGroceryList = { "eggs", "mild", "bread", "bananas", "cereal", "rice" };

        for ( Integer index = 0; index < myGroceryList.length; index++ ) {
            System.out.println( myGroceryList[index] );
        }
    }
}