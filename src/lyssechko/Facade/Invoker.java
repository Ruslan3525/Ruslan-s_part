package lyssechko.Facade;

public class Invoker implements Character2 {
    @Override
    public void useSpell() {
        System.out.println("Invoker uses cold snap spell.");
    }

    @Override
    public void attack() {
        System.out.println("Invoker is attacking.");
    }
}
