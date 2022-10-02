public class Chicken extends EggLaying implements Bipedal {
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

    @Override
    public void jump() {
        System.out.println("Chicken jumps...");
    }
}
