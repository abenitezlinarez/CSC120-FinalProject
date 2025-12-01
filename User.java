import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private int age;
    private String gender;
    private double money;
    private boolean hasCar;
    private int parkingSpot;
    private List<String> shoppingList; 
    private int hunger; // starts at zero and increases with every exit. 

    // use scanner to get input for the constructor
    public User(String name, int age, String gender, double money, boolean hasCar, int hunger) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.money = money;
        this.hasCar = hasCar;
        this.parkingSpot = -1;
        this.shoppingList = new ArrayList<>();
        this.hunger = hunger; 
        System.out.println("Welcome, " + name + "! We are so glad to welcome you!");
        if (hasCar) {
            System.out.println("I see you have a car with you today. Go ahead and park it in any available spot!");
        } else {
            System.out.println("I see you do not have a car with you today. Feel free to walk right in!");
        }
        System.out.println("I see you have $" + money + " to spend today.");
        System.out.println("I see your age is " + age + " and your gender is " + gender + ".");
        //System.out.println("Based on this I would recommend " + this.viewShoppingList() + " for your shopping list today.");
    }

    public String getName() {
        return this.name;
    }

    /**
     * Gets input from user & converts it to a string
     * @return string formatted user input 
     */
    public String getInput() { 
        Scanner input = new Scanner(System.in);  
        input.close();
        String string = input.toString();
        string = string.trim(); 
        string = string.toLowerCase(); 
        return string; 
    }
    
    public void addToShoppingList(String item) {
        
    }

    public void removeFromShoppingList(String item) {
        
    }

    public void viewShoppingList() {
        System.out.println(this.shoppingList);
    }

    public void enterTheMall() {
        System.out.println("Welcome to the mall " + name + "! Enjoy your shopping experience!");
    }

    public void leaveTheMall() { 
        System.out.println("You have exited the mall! Unfortunately, the mall is huge! You've lost hunger :( Your hunger level is now: " + (this.hunger + 1));

    }

    public void park(int spotNumber) { 
        System.out.println("Congratulations! You've found parking! Parking at spot number: " + spotNumber);
        System.out.println("Unfortunately it's a long walk to the mall, so you will be more hungry. Your new hunger is" + (this.hunger + 1));
    }

    public void shop(double price) { 

    }

    public void useBathroom() { 

    }

    public void eat(Food food) { 
        food.dine(this.hunger, this.money);
    }

    public void play(String game) { 

    }
}