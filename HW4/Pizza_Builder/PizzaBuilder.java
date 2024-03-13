package Pizza_Builder;
public class PizzaBuilder {

    private String chain;
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



    public PizzaBuilder() {
    }

    public PizzaBuilder setChain(String chain) {
        this.chain = chain;
        return this;
    }

    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    public PizzaBuilder setPepperoni(boolean pepperoni) {
        this.pepperoni = pepperoni;
        return this;
    }

    public PizzaBuilder setSausage(boolean sausage) {
        this.sausage = sausage;
        return this;
    }

    public PizzaBuilder setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
        return this;
    }

    public PizzaBuilder setBacon(boolean bacon) {
        this.bacon = bacon;
        return this;
    }

    public PizzaBuilder setOnions(boolean onions) {
        this.onions = onions;
        return this;
    }

    public PizzaBuilder setExtraCheese(boolean extra_cheese) {
        this.extra_cheese = extra_cheese;
        return this;
    }

    public PizzaBuilder setPeppers(boolean peppers) {
        this.peppers = peppers;
        return this;
    }

    public PizzaBuilder setChicken(boolean chicken) {
        this.chicken = chicken;
        return this;
    }

    public PizzaBuilder setOlives(boolean olives) {
        this.olives = olives;
        return this;
    }

    public PizzaBuilder setSpinach(boolean spinach) {
        this.spinach = spinach;
        return this;
    }

    public PizzaBuilder setTomatoAndBasil(boolean tomato_and_basil) {
        this.tomato_and_basil = tomato_and_basil;
        return this;
    }

    public PizzaBuilder setBeef(boolean beef) {
        this.beef = beef;
        return this;
    }

    public PizzaBuilder setHam(boolean ham) {
        this.ham = ham;
        return this;
    }

    public PizzaBuilder setPesto(boolean pesto) {
        this.pesto = pesto;
        return this;
    }

    public PizzaBuilder setSpicyPork(boolean spicy_pork) {
        this.spicy_pork = spicy_pork;
        return this;
    }

    public PizzaBuilder setHamAndPineapple(boolean ham_and_pineapple) {
        this.ham_and_pineapple = ham_and_pineapple;
        return this;
    }

    public Pizza createPizza() {
        return new Pizza(chain, size, pepperoni, sausage, mushrooms, bacon, onions, extra_cheese, peppers, chicken, olives, spinach, tomato_and_basil, beef, ham, pesto, spicy_pork, ham_and_pineapple);
    }
}