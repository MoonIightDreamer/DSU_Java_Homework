public class Sheep extends Vivaparous{
    public Sheep(int size) {
        super(size);
    }

    @Override
    public void eat() {
        System.out.println("Sheep eats...");
    }

    @Override
    public void walk() {
        System.out.println("Sheep walks...");
    }
}
