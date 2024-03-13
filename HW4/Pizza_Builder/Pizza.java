package Pizza_Builder;
public class Pizza {

    private String chain; // for the sake of time I made the chain a string paramater instead of a new class all together
    private String size;
    private boolean pepperoni;
    private boolean sausage;
    private boolean mushrooms;
    private boolean bacon;
    private boolean onions;
    private boolean extra_cheese;
    private boolean peppers;
    private boolean chicken;
    private boolean olives;
    private boolean spinach;
    private boolean tomato_and_basil;
    private boolean beef;
    private boolean ham;
    private boolean pesto;
    private boolean spicy_pork;
    private boolean ham_and_pineapple;



    public Pizza(String chain, String size, boolean pepperoni, boolean sausage, boolean mushrooms, boolean bacon, boolean onions, boolean extra_cheese, boolean peppers, boolean chicken, boolean olives, boolean spinach, boolean tomato_and_basil, boolean beef, boolean ham, boolean pesto, boolean spicy_pork, boolean ham_and_pineapple) {
        this.chain = chain;
        this.size = size;
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.bacon = bacon;
        this.onions = onions;
        this.extra_cheese = extra_cheese;
        this.peppers = peppers;
        this.chicken = chicken;
        this.olives = olives;
        this.spinach = spinach;
        this.tomato_and_basil = tomato_and_basil;
        this.beef = beef;
        this.ham = ham;
        this.pesto = pesto;
        this.spicy_pork = spicy_pork;
        this.ham_and_pineapple = ham_and_pineapple;
    }

    public String eat() {
        String output = "";
        output += ("Pizza Chain: " + chain + "\n");
        output += ("Pizza Size: " + size + "\n");
        output += ("Toppings: \n");
        if (pepperoni) output += ("- Pepperoni\n");
        if (sausage) output += ("- Sausage\n");
        if (mushrooms) output += ("- Mushrooms\n");
        if (bacon) output += ("- Bacon\n");
        if (onions) output += ("- Onions\n");
        if (extra_cheese) output += ("- Extra Cheese\n");
        if (peppers) output += ("- Peppers\n");
        if (chicken) output += ("- Chicken\n");
        if (olives) output += ("- Olives\n");
        if (spinach) output += ("- Spinach\n");
        if (tomato_and_basil) output += ("- Tomato and Basil\n");
        if (beef) output += ("- Beef\n");
        if (ham) output += ("- Ham\n");
        if (pesto) output += ("- Pesto\n");
        if (spicy_pork) output += ("- Spicy Pork\n");
        if (ham_and_pineapple) output += ("- Ham and Pineapple\n");
        return output;
    }
} 