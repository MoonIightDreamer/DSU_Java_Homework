package dz.ex;

public class Sparrow implements Animal, Flyable {
    private final double flyingSpeed;

    public Sparrow(double flyingSpeed) {
        this.flyingSpeed = flyingSpeed;
    }

    @Override
    public void birth(String name) {
        System.out.println("Рождается воробей");
    }

    @Override
    public long walk(long distance) {
        return 1;
    }

    @Override
    public void die() {
        System.out.println("Умирает воробей");
    }

    @Override
    public void fly() {
        System.out.println("Воробей летит со скоростью " + flyingSpeed);
    }
}
