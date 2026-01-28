package week4;
 // LESSON 4 - PART 2
 
public class ArrayListDemo {
    public static void main(String[] args) {
 
        // STEP 1: Create an ArrayList of Strings
        int[] numbers = {10,30,50,70,90};

        // STEP 2: Add elements to the ArrayList
        

        System.out.println("acessing array elements");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println( "index: " + i + " : " + numbers[i]);
        }
 
        // STEP 3: Print all elements
       numbers[1] = 35;
 
       //enahnced for loop
        //for(int Variable: array){}

        for(int num : numbers){
            System.out.println(num);
        }
        
        // STEP 4: Remove an element
       
 
        // STEP 5: Access element by index
       
 
        // STEP 6: Check if a fruit exists
        
} 
}