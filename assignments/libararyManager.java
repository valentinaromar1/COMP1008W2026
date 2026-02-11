import java.util.Scanner;
import books.java;

public class libararyManager {
    Scanner input = new Scanner(System.in);
    
    System.out.println("what would you like to access?:");
    System.out.println("a) add a new book");
    System.out.println("b) display all books");
    System.out.println("c) search by author");
    System.out.println("d) check out");
    System.out.println("e) return book");
    System.out.println("exit:");

    userInput = input.toString();
        

        if(userInput = "a"){
            System.out.println("please input the info of the book you'd like to add");
        }

        else if(userInput = "b"){
            displayBookInfo(); 
        }

        else if(userInput = "c"){
            System.out.println("what is the authors name");
            System.err.println("author" + bookAuthorName1);
            System.err.println("author" + bookAuthorName2);
            System.err.println("author" + bookAuthorName3);
            System.err.println("author" + bookAuthorName4);           
        }

        else if(userInput = "d"){
            System.out.println("what book would you like to checkout?");
            System.err.println(bookName1 + " by " + bookAuthorName1);
            System.err.println(bookName2 + " by " + bookAuthorName2);
            System.err.println(bookName3 + " by " + bookAuthorName3);
            System.err.println(bookName4 + " by" + bookAuthorName4);
        }

        else if(userInput = "e"){
            System.out.println("what book are you returning");
            System.err.println(bookName1 + " by " + bookAuthorName1);
            System.err.println(bookName2 + " by " + bookAuthorName2);
            System.err.println(bookName3 + " by " + bookAuthorName3);
            System.err.println(bookName4 + " by" + bookAuthorName4);
        }
        
        else if (userInput = "exit"){
            System.out.println("bye bye");
        }

        else{
            System.out.println("that is not a vaild option");
        }
}
