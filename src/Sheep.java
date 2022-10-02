public class Sheep extends Vivaparous implements Horned {
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

    @Override
    public void gore() {
        System.out.println("Sheep gores...");
    }
}
