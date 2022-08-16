package low_coupling.coffee;

public class Espresso implements Coffee {

    @Override
    public void make() {
        System.out.println("Your espresso. Enjoy :)");
    }
}
