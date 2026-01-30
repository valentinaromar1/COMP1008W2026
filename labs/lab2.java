
import java.util.ArrayList;
 
public class lab2 {
    public static void main(String[] args) {
 
        // Lab 4 – COMP1008 Programming Fundamentals
        // Topic: Arrays & ArrayLists
 
        // ================================================
        // STEP 1: Create an array of grocery items (String)
        // Add at least 6 items to the array
        // Example: {"Milk", "Eggs", "Bread", ... }
        // ================================================
        String[] groceries = {
            "milk", "eggs", "cheese", "bread"
            // TODO: Fill in your grocery items
        };
 
 
        // ================================================
        // STEP 2: Print the array using Arrays.toString()
        // ================================================
        for(String i: groceries){
            System.out.println(i);
        }
 
 
        // ================================================
        // STEP 3: Transfer all array items into an ArrayList
        // Use a loop to add each item
        // ================================================
        ArrayList<String> groceryList = new ArrayList<>();
 
        // TODO: Loop through the array and add items to groceryList
        groceryList.add("milk");
        groceryList.add("egg");
        groceryList.add("cheese");
        groceryList.add("bread");
 
 
        // ================================================
        // STEP 4: Modify the ArrayList
        // Add two new items
        // Remove one item by name or index
        // Print the updated ArrayList
        // ================================================

        //print list
        for(String i: groceryList){
            System.out.println(i);
        }
        //add_item
        groceryList.add("juice");
        groceryList.add("ice cream");
        //remove item
        groceryList.remove("milk");
        
        //print updated list
        for(String i: groceryList){
            System.out.println(i);
        }
 
        // ================================================
        // STEP 5: Count how many items start with a vowel
        // Hint: vowels = a, e, i, o, u
        // Use .toLowerCase(). startsWith()
        // ================================================
        int vowelCounter = 0;
        
        //if(groceryList.startsWith("a","e","i","o","u")){
            vowelCounter += 1;
            
        // ================================================
        // STEP 6: Print the final results
        // ================================================
        }
        //System.out.println("the number of vowels at the start of grocery list items is: " + vowelCounter);
    }

 