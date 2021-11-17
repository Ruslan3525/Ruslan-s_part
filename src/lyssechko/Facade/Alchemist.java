package lyssechko.Facade;

public class Alchemist implements Character2{
    @Override
    public void attack() {
        System.out.println("Alchemist is attacking.");
    }

    @Override
    public void useSpell() {
        System.out.println("Alchemist uses acid spray spell.");
    }
}
