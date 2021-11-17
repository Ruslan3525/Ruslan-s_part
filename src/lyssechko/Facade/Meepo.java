package lyssechko.Facade;

public class Meepo implements Character2 {
    @Override
    public void attack() {
        System.out.println("Meepo is attacking");
    }

    @Override
    public void useSpell() {
        System.out.println("Meepo uses poof spell.");
    }
}
