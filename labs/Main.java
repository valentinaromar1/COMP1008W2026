package labs;

import java.util.Scanner;
 
 //valentina romar
 
/*
    Week 2 Lab: Weather Report Program
    Topics: Conditional statements, loops, typecasting, input validation
    Objective: Ask the user for weather info, validate input, and display a full report
*/
 
 
public class Main {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
 
        /*
        STEP 1: Declare variables for weather information
        a) Today's weather conditions (String)
        b) Possibility of precipitation (String)
        c) Wind speed (String)
        d) Daily high temperature (int or double)
        e) Daily low temperature (int or double)
        f) UV index (int)
        */


        // TODO: Declare your variables here
        String weatherConditions;
        int possibilityOfPrecipitation;
        int windSpeed;
        double dailyHighTemp;
        double dailyLowTemp;
        int UVIndex;
 
        /*
        STEP 2: Get input from the user using Scanner
        - Ask for each variable above
        - Validate numeric input using loops
        - Example: Ensure highTemp >= lowTemp
        */
 
 
        // TODO: Prompt user and read input
        // TODO: Use loops to validate high/low temperatures and UV index
        Scanner input = new Scanner(System.in);
        
        //weather conditions 
        while (true) {
            System.out.print("weather conditions: sunny or cloudy? ");
                weatherConditions = input.next();
                break; 
        }
        
        //poss of percipition    
        while (true) {
            System.out.print("possiblity of perciption: ");

            if (input.hasNextDouble()) {
                possibilityOfPrecipitation = input.nextInt();
                break; 
            }
            else {
                System.out.println("please input a number");
                input.next(); 
            }
        }  

        //wind speed
        while (true) {
            System.out.print("wind speed: ");

            if (input.hasNextDouble()) {
                windSpeed = input.nextInt();
                break; 
            }
            else {
                System.out.println("please input a number");
                input.next(); 
            }
        } 

        //vaidate daily low temp
        while (true) {
            System.out.print("Enter daily low temp: ");

            if (input.hasNextDouble()) {
                dailyLowTemp = input.nextDouble();
                break; 
            }
            else {
                System.out.println("please input a number");
                input.next(); 
            }
        }
        //validate daily high temp
        while (true) {
            System.out.print("Enter daily high temp: ");

            if (input.hasNextDouble()) {
                dailyHighTemp = input.nextDouble();
                break; 
            }
            else {
                System.out.println("please input a number");
                input.next(); 
            }
        }
        //validate UVIndex
        while (true) {
            System.out.print("Enter UV index: ");

            if (input.hasNextDouble()) {
                UVIndex = input.nextInt();
                break; 
            }
            else {
                System.out.println("please input a number");
                input.next(); 
            }
        }        

        /*
        STEP 3: Typecasting (if needed)
        - Example: if you read a double but want to display as int
        */
 
 
        // TODO: Apply typecasting where necessary
 
 
        /*
        STEP 4: Conditional statements
        - Example: 
          - If UV index >= 6, suggest "Use sunscreen"
          - If precipitation >= 50%, suggest "Carry an umbrella"
          - If wind speed > 40 km/h, suggest "Windy conditions"
        */
            if( UVIndex >= 6){
                System.out.println("use sunscreen");
            }else{
                System.out.println("");
            }
            

 
        // TODO: Write if, if-else, or nested if statements to display tips

 
        /*
        STEP 5: Create a fullReport String
        - Combine all user inputs and tips into one formatted sentence or paragraph
        - Use String concatenation (+) or String.format()
        */
        String fullReport() {
        
        // TODO: Print all fields
        System.out.println("\n---daily weather info---");
        System.out.println("weather conditions:" + weatherConditions);
        System.out.println("possibility of precipition" + possibilityOfPrecipitation);
        System.out.println("daily high temp: " + dailyHighTemp);
        System.out.println("daily low temp: " + dailyLowTemp);
        System.out.println("UV index: " + UVIndex);
        }
        //}
 
        // TODO: Construct your full weather report here
 
 
        /*
        STEP 6: Print the full weather report
        */
 
 
        // TODO: Output your report using System.out.println()
        //System.out.println(fullReport());
        
 
        /*
        STEP 7: Optional extra challenge
        - Use loops to ask if the user wants to enter another day's report
        - Continue until the user types "no"
        */
 
 
        // TODO: Implement loop for multiple reports
 
 
        input.close();
    }
}
 