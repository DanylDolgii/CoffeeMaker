package low_coupling.coffee;

public class Latte implements Coffee {

    @Override
    public void make() {
        System.out.println("Your latte. Enjoy :)");
    }
}
