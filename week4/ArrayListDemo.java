// LESSON 4 - PART 2

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
 
        // STEP 1: Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // STEP 2: Add elements to the ArrayList
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("peach");
        fruits.add("cherry");

 
        // STEP 3: Print all elements
        for(String i: fruits){
            System.out.println(i);
        }

        // STEP 4: Remove an element
       //fruits.remove("banana");
        fruits.remove(1);

        // STEP 5: Access element by index
       System.out.println("\nfrist fruit " + fruits.get(0));
 
        // STEP 6: Check if a fruit exists
        
        if(fruits.contains("cherry")){
            System.out.println("cherry is in the list");
        }
} 
}