public class Main {
    public static void main(String[] args) {
        //testing polymorphism

        Human human = new Human(180);
        Chicken chicken = new Chicken(35);
        Cow cow = new Cow(130);
        Sheep sheep = new Sheep(60);
        Pigeon pigeon = new Pigeon(25);
        Sparrow sparrow = new Sparrow(15);

        Creature[] creatures = { human, chicken, cow, sheep, pigeon, sparrow };
        Bipedal[] bipedals = { human, chicken };
        Flyable[] flyables = { sparrow, pigeon };
        Horned[] hornedArr = { sheep, cow };

        for( Creature c : creatures) c.eat();
        System.out.println();

        for (Bipedal b : bipedals) b.jump();
        System.out.println();

        for ( Flyable f : flyables) f.fly();
        System.out.println();

        for (Horned h : hornedArr) h.gore();
        System.out.println();
    }
}