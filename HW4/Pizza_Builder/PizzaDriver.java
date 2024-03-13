package Pizza_Builder;
class Main {
    public static void main(String[] args) {
        System.out.println("### First 3 Pizzas\n");

        // Pizza Hut
        Pizza pizza3Top = new PizzaBuilder().setChain("Pizza Hut").setSize("Small").setBacon(true).setBeef(true).setChicken(true).createPizza();
        Pizza pizza6Top = new PizzaBuilder().setChain("Pizza Hut").setSize("Medium").setBacon(true).setBeef(true).setChicken(true).setChicken(true).setExtraCheese(true).setHam(true).createPizza();
        Pizza pizza9Top = new PizzaBuilder().setChain("Pizza Hut").setSize("Large").setBacon(true).setBeef(true).setChicken(true).setChicken(true).setExtraCheese(true).setHam(true).setMushrooms(true).setOlives(true).setOnions(true).createPizza();

        System.out.println(pizza3Top.eat());
        System.out.println(pizza6Top.eat());
        System.out.println(pizza9Top.eat());

        System.out.println("### Next 6 Pizzas\n");
        // New Chains Added
        Pizza phPizza3Top = new PizzaBuilder().setChain("Pizza Hut").setSize("Large").setBacon(true).setBeef(true).setChicken(true).createPizza(); 
        Pizza phPizza2Top = new PizzaBuilder().setChain("Pizza Hut").setSize("Small").setBacon(true).setBeef(true).createPizza(); 

        Pizza lcPizza8Top = new PizzaBuilder().setChain("Little Caesars").setSize("Medium").setBacon(true).setBeef(true).setChicken(true).setChicken(true).setExtraCheese(true).setHam(true).setMushrooms(true).setOlives(true).createPizza();
        Pizza lcPizza6Top = new PizzaBuilder().setChain("Little Caesars").setSize("Small").setBacon(true).setBeef(true).setChicken(true).setChicken(true).setExtraCheese(true).setHam(true).createPizza();

        Pizza dPizza1Top = new PizzaBuilder().setChain("Dominos").setSize("Small").setBacon(true).createPizza();
        Pizza dPizza3Top = new PizzaBuilder().setChain("Dominos").setSize("Large").setBacon(true).setBeef(true).setChicken(true).createPizza(); 


        System.out.println(phPizza3Top.eat());
        System.out.println(phPizza2Top.eat());

        System.out.println(lcPizza8Top.eat());
        System.out.println(lcPizza6Top.eat());

        System.out.println(dPizza1Top.eat());
        System.out.println(dPizza3Top.eat());
    }
}