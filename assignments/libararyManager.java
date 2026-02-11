import java.util.Scanner;

public class libararyManager {
    Scanner input = new Scanner(System.in);
    
    System.out.println("what would you like to access?:");
    System.out.println("a) add a new book");
    System.out.println("b) display all books");
    System.out.println("c) search by author");
    System.out.println("d) check out");
    System.out.println("e) return book");
    System.out.println("exit");

    userInput = input.toString();
        

        if(userInput = "a"){
            System.out.println("please input the info of the book you'd like to add");
        }
        else if(userInput = "b"){
            displayBookInfo(); 
        }
        else if(userInput = "c"){
            System.out.println("what is the authors name");
            System.err.println("athor"bookAuthorName1);
        }
        else if(userInput = "d"){
            System.out.println("what book would you like to checkout");
        }
        else if(userInput = "e"){
            System.out.println("what book are you returning");

        }
        else if (userInput = "exit"){
            System.out.println("bye bye");
        }
        else{
            System.out.println("that is not a vaild option");
        }
}
