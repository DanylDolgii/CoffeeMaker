package low_coupling;

import low_coupling.coffemachine.CoffeeMachine;

public class App {
    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.setCoffee();
        coffeeMachine.makeCoffee();
    }
}
