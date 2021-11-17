package lyssechko.AbstractFactory;

public class LateGameFactory implements AbstractFactory {
    @Override
    public InvokerWithLandCast createLandCast() {
        return new UpgradedAlacrity();
    }

    @Override
    public InvokerWithAirCast createAirCast() {
        return new UpgradedSunStrike();
    }
}
