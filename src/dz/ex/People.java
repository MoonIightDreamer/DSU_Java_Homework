package dz.ex;

public class People implements Animal {
    private String name;

    @Override
    public void birth(String name) {
        this.name = name;
        System.out.println("Рождается объект с именем " + name);
    }

    @Override
    public long walk(long distance) {
        return 3;
    }

    @Override
    public void die() {
        System.out.println("Умирает объект с именем " + name);
        name = null;
    }
}
