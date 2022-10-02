public class Cow extends Vivaparous{
    public Cow(int size) {
        super(size);
    }

    @Override
    public void eat() {
        System.out.println("Cow eats...");
    }

    @Override
    public void walk() {
        System.out.println("Cow walks...");
    }
}
