public class Chicken extends EggLaying{
    public Chicken(int size) {
        super(size);
    }

    @Override
    public void eat() {
        System.out.println("Chicken eats...");
    }

    @Override
    public void walk() {
        System.out.println("Chicken walks...");
    }
}
