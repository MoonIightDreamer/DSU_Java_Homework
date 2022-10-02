public class Human extends Vivaparous{
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
}
