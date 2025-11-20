/**
 * File name: Employee.java
 * Author Michelle Jiang 
 * Description: 
 * Date: 2025-11-20
 */

// Imports for lists, maps, user input, and random number generator used in chatbot
import java.util.ArrayList; 
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 
import java.lang.Math; 

public class Employee {

    // Attributes 
    Store store; 
    User user; 

    // Constructor
    public Employee(Store store, User user) {
        this.store = store; 
        this.user = user; 
    }

    /**
     * Initial user greeting 
     */
    public void greetCustomer() { 
        System.out.println("Hello" + this.user + ", welcome to " + this.store + "! ");
    }

    /**
     * Asks user to buy items from inventory 
     */
    public void mainConversation() { 
        System.out.println("What would you like to purchase from this store? ");
        String item = getInput(); 
        // check if item is in shopping list 
        // if item in this.store.items key?? 
        // buy the item 
        // else suggest item 
    }

    /**
     * Gets input from user & converts it to a string
     * @return string trimmed user input 
     */
    public String getInput() { 
        Scanner input = new Scanner(System.in);  
        input.close();
        String string = input.toString();
        string = string.trim(); 
        return string; 
    }

    /** 
     * Given the desired item of the user, suggests the next item in the inventory -- OR suggests similar item
     */
    public void suggestItem(String item) { 
        // suggests item
        // adds item to shopping list!
    }

    public static void main(String[] args) {
        System.out.println("Hello, Employee!");
    }
}
