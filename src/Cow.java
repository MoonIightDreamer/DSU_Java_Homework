public class Cow extends Vivaparous implements Horned {
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

    @Override
    public void gore() {
        System.out.println("Cow gores...");
    }
}
