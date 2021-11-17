package lyssechko.Facade;

public class AdditionalFacade {
    private final Character2 alchemist;
    private final Character2 invoker;
    private final Character2 meepo;

    public AdditionalFacade() {
        alchemist = new Alchemist();
        invoker = new Invoker();
        meepo = new Meepo();
    }

    public void attackAlchemistWithoutSpell() {
        alchemist.attack();
    }

    public void attackAlchemistWithSpell() {
        alchemist.attack();
        alchemist.useSpell();
    }

    public void attackMeepoWithSpell() {
        meepo.attack();
        meepo.useSpell();
    }

    public void attackMeepoWithoutSpell() {
        meepo.attack();
    }

    public void attackInvokerWithoutSpell() {
        invoker.attack();
    }

    public void attackInvokerWithSpell() {
        invoker.attack();
        invoker.useSpell();
    }
}
