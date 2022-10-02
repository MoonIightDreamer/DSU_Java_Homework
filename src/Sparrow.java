public class Sparrow extends EggLaying{
    public Sparrow(int size) {
        super(size);
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eats...");
    }

    @Override
    public void walk() {
        System.out.println("Sparrow walks...");
    }
}
