public class Food {
    String name; 
    boolean type; // false for snack true for meal
    int hungerReduction; 
    double price; 

    public Food(String name, boolean type) { 
        this.name = name; 
        this.type = type; 
        if (this.type) { 
            this.hungerReduction = -5; 
            this.price = 20.;
        } else { 
            this.hungerReduction = -1; 
            this.price = 5.;
        }
    }
}
