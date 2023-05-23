public class GroceryList {
    public static void main(String[] args) {
        String[] myGroceryList = { "ice cream", "hot sauce", "pickles", "bananas", "cereal", "rice", "yoghurt" };
        Integer[] groceryItemPrices = { 3, 6, 4, 2, 4, 4, 5 };

        for ( String groceryItem : myGroceryList ) {
          System.out.println( groceryItem);
        }

        Integer total = 0;
        for ( Integer price : groceryItemPrices) {
            total += price;
        }

        System.out.println("Your total for this shopping trip will be: $" + total);
    }
}