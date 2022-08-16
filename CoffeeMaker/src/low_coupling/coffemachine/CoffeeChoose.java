package low_coupling.coffemachine;

import low_coupling.coffee.Cappuccino;
import low_coupling.coffee.Coffee;
import low_coupling.coffee.Espresso;
import low_coupling.coffee.Latte;

import java.util.Scanner;

class CoffeeChoose {

    public static Coffee coffeeChoose() {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            switch (scanner.nextLine()) {
                case "1":
                    return new Espresso();
                case "2":
                    return new Cappuccino();
                case "3":
                    return new Latte();
                default:
                    System.out.println("Wrong value! Try Again pleas!");
            }
        }
    }
}
