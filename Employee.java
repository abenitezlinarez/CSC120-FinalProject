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

    public void greetCustomer() { 
        System.out.println("Hello" + this.user + ", welcome to " + this.store + "! ");
        System.out.println("What would you like to purchase from this store? ");
    }

    public static void main(String[] args) {
        System.out.println("Hello, Employee!");
    }
}
