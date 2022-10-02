public class Human extends Vivaparous implements Bipedal {
    public Human(int size) {
        super(size);
    }

    @Override
    public void eat() {
        System.out.println("Human eats...");
    }

    @Override
    public void walk() {
        System.out.println("Human walks...");
    }

    @Override
    public void jump() {
        System.out.println("Human jumps...");
    }
}
