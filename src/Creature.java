public abstract class Creature {
    private int size;

    public abstract void eat();

    public abstract void walk();

    public Creature(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
