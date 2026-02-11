import java.util.Scanner;
 
 
/*
    Week 2: Module 2 Learning Activity - Practice Shell
    Concepts to Practice:
    - Variables & Constants
    - if / if…else / nested if
    - switch statements
    - while and for loops
    - Increment (++) / Decrement (--) / Compound Assignment (+=, -=)
    - Typecasting
*/
 
 
class Student {
    // STEP 1: Declare instance variables
    String name;
    int id;
    String program;
    int gradeLevel;
    double gpa;
 
 
    // STEP 2: Declare a constant (final)
final double MIN_GPA = 0;
 
    // STEP 3: Method to display student info
    void displayInfo() {
        // TODO: Print all fields
        System.out.println("\n---Student Info---");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Program: " + program);
        System.out.println("Grade level: " + gradeLevel);
        System.out.println("GPA: " + gpa);
     
    }

    // STEP 4: Conditional statements (if…else)
    void checkGPA() {
        // TODO: Use if…else to check GPA ranges
        if(gpa >= 3.5){
            System.out.println(name + " is an honor student ");
        } else if (gpa >= 2.0){
            System.out.println(name + " has a passing gpa ");
        }else{
            System.out.println(name + " student needs inprovement ");
        }
    }
 
 
    // STEP 5: Nested if example
    void checkProgram() {
        // TODO: Nested if for program and GPA
        if(program.equalsIgnoreCase("Computer Science ")){
            if(gpa >= 3.5){
                System.out.println(name + " is eligible for CS scholoarship ");
            }else{
                System.out.println(name + " is not eligible for CS scholarship ");
            }
        }
    }
 
 
    // STEP 6: Switch statement example
    void gradeDescription() {
        switch(gradeLevel){
            case 1: case 2: case 3:
            System.out.println(name + " is in elementary school ");
            break;
            case 4: case 5: case 6:
            System.out.println(name + " is in middle school ");
            break;
            case 7: case 8: case 9:
            System.out.println(name + " is in junior high school ");
            break;
            case 10: case 11: case 12:
            System.out.println(name + " is in highschool ");
            break;   
            default:
            System.out.println(" invalid grade level ");

        }
        // TODO: Use switch to print school type based on gradeLevel

    }
 
 
    // STEP 7: While loop example
    void printNumbersUpToGPA() {
        // TODO: Use while loop, typecast GPA to int
        int count = 1;
     
        while(count <= (int)gpa){
            System.out.println(count + " ");
            count++;
        }
        System.out.println();
    }
    

    //step7: do-while

    void enterGPAS(){
        Scanner input = new Scanner(System.in);
        double gpaInput;
        do { 
            System.out.println("");
            gpaInput = input.nextDouble();

            if(gpaInput != -1){
                System.out.println("recourded GPA: " + gpaInput);
            }
        } while (gpaInput != -1);
        System.out.println("all semester GPA are recorded");
    }
 
    // STEP 8: For loop example
    void printMultiplesOfID() {
        // TODO: Use for loop to print multiples of ID
    }
 
 
    // STEP 9: Increment / Decrement / Compound assignment example
    void updateGPA() {
        // TODO: Demonstrate ++, --, +=, -= with GPA
        System.err.println("Orignal GPA" + gpa);
        gpa++;//gpa=gpa+1
        System.out.println("updated GPA" + gpa);
        gpa += 0.5;
        System.out.println("updated GPA" + gpa);
        gpa--;
        System.out.println("updated GPA" + gpa);
        gpa =- 0.2;
        System.out.println("updated GPA" + gpa);
    }
}
 
 
 
// MAIN CLASS
 
public class class2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
 
        System.out.println("==== Week 2: Module 2 Learning Activity ====");
 
 
        // STEP 1: Create a Student object
        Student s1 = new Student();
 
 
        // STEP 2: Assign values to fields (or use Scanner input)
        s1.name = "moni";
        s1.id = 101;
        s1.program = "computer science";
        s1.gradeLevel = 5;
        s1.gpa = 4.5;
 
        // STEP 3: Call methods to practice all concepts
        s1.displayInfo();
        s1.checkGPA();
        s1.checkProgram();
        s1.gradeDescription();
        s1.printNumbersUpToGPA();
        s1.printMultiplesOfID();

        s1.enterGPAS();
        s1.updateGPA();
    }
}  

