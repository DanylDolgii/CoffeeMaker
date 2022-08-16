package low_coupling.coffee;

public class Cappuccino implements Coffee {

    @Override
    public void make() {
        System.out.println("Your cappuccino. Enjoy :)");
    }
}
