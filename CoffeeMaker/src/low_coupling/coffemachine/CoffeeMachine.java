package low_coupling.coffemachine;

import low_coupling.coffee.Coffee;

public class CoffeeMachine {

    private Coffee coffee;

    public void setCoffee() {
        Menu.menu();
        this.coffee = CoffeeChoose.coffeeChoose();
    }

    public void makeCoffee() {
        coffee.make();
    }
}
