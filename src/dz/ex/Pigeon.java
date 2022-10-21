package dz.ex;

public class Pigeon implements Animal, Flyable {
    private final double flyingSpeedMax = 5d;
    private final int oldMonth;

    public Pigeon(double flyingSpeed, int oldMonth) {
        this.oldMonth = oldMonth;
    }

    @Override
    public void birth(String name) {
        System.out.println("Рождается голубь");
    }

    @Override
    public long walk(long distance) {
        return 1;
    }

    @Override
    public void die() {
        System.out.println("Умирает голубь");
    }

    @Override
    public void fly() {
        System.out.println("Голубь летит со скоростью " + getFlySpeed());
    }

    private double getFlySpeed() {
        if (oldMonth < 30) {
            return flyingSpeedMax / 5;
        } else if (oldMonth > 60) {
            return flyingSpeedMax / 3;
        } else {
            return flyingSpeedMax;
        }
    }
}