
import java.util.regex.Matcher;
import java.util.regex.Pattern;


 
 
public class StringAndRegexLab {
 
 
    public static void main(String[] args) {
 
 
        // =====================================================
        // ================= PART 1 ============================
        // Strings, StringBuilder, Character, Tokenizing
        // =====================================================
 
 
        // STEP 1: Create a String called message
        // Assign value: "Java Programming Language"
        String message = "java programming language";
 
        // STEP 2: Print length of message
        System.out.println("length:" + message.length());
 
        // STEP 3: Print character at index 5
 
        System.out.println("character at 5:" + message.charAt(5));
 
        // STEP 4: Extract substring "Programming"
        String sub = message.substring(5,16);
        
        System.out.println("substring: " + sub);

 
        // STEP 5: Compare two strings using equals()
        String another = "java programing language";
 
        System.err.println("are equal: " + message.equals(another));
 
        // STEP 6: Convert message to uppercase
 
        System.out.println("uppercase: " + message.toUpperCase());
 
        // STEP 7: Use StringBuilder
        // Create StringBuilder with "Hello"
        // Append " Java"
        // Insert "Awesome " at beginning
        // Reverse it
        // Print result
        StringBuilder sb = new StringBuilder("hello");
 
        sb.append("java");
        sb.insert(0,"awsome");
        sb.reverse();
        System.out.println("string builder result: " + sb);

        // STEP 8: Use Character class
        // Create char variable
        // Check isDigit, isLetter, isUpperCase
        char ch = 'A';
        System.out.println("is digit" + Character.isDigit(ch));
         
        System.out.println("is letter" + Character.isLetter(ch));
         
        System.out.println("is uppercase" + Character.isUpperCase(ch));
 
 
        // STEP 9: Tokenize this string:
        // "Apple,Banana,Mango"
        // Split by comma and print each fruit
        String fruits = "apple, banana, mango";
 
        String[] tokens = fruits.split(",");
        
        for(String fruit : tokens){
            System.out.println(fruits);
        }
 
 
        // =====================================================
        // ================= PART 2 ============================
        // Regular Expressions (Pattern & Matcher)
        // =====================================================
 
 
        // STEP 10: Validate Email using regex
        // Create a String email = "student@email.com"
        String email = "student@email.com";
        // Write regex to validate simple email format
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9+_.-]+$";
        // Print if valid or not
 
        if(email.matches(emailRegex)){
            System.out.println("this email is vaild");
        }else{
            System.out.println("this email is invaild");
        }
        // STEP 11: Replace digits in a string
        // Example: "Java123"
        String replace = "Java123";
        // Replace all digits with "*"
        String replaced = replace.replaceAll("\\d","*");
 
        System.out.println("result: " + replaced);
 
 
        // STEP 12: Extract all numbers from string
        // Example: "Order number is 4567"

        String text = "Order number is 4567";
        Pattern pattern = Pattern.compile("\\d+");
        // Use Pattern and Matcher
        Matcher matcher = pattern.matcher(text);
        // Print matched number
        while(matcher.find()){
            System.out.println("found num:" + matcher.group());
        }
        

        // STEP 13: Check if string contains only letters
        // Example: "JavaOnly"
        String lettersOnly = "JavaOnly";
        // Print true/false
        System.out.println("only letters? " + lettersOnly.matches("[A-Za-z]"));
 
 
        // STEP 14: Split sentence using regex
        // Sentence: "Java   is   powerful"
        String sentance = "java   is   powerful";
        // Split by multiple spaces
        String[] words = sentance.split("\\s+");
        // Print each word
        for(String word: words){
            System.out.println("word: " + word);
        }
 
 
 
 
 
    }
}
 
 
 