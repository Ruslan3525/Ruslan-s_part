package lyssechko.AbstractFactory;

public class InitialSunStrike implements InvokerWithAirCast {
    @Override
    public void attackFromAir() {
        System.out.println("I`m attacking with damage 100");
    }
}
