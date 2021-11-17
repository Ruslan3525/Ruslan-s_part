package lyssechko.AbstractFactory;

public class InitialGameFactory implements AbstractFactory {
    @Override
    public InvokerWithLandCast createLandCast() {
        return new InitialAlacrity();
    }

    @Override
    public InvokerWithAirCast createAirCast() {
        return new InitialSunStrike();
    }
}