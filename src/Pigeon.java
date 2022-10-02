public class Pigeon extends EggLaying{
    public Pigeon(int size) {
        super(size);
    }

    @Override
    public void eat() {
        System.out.println("Pigeon eats...");
    }

    @Override
    public void walk() {
        System.out.println("Pigeon walks...");
    }
}
