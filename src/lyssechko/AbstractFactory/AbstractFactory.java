package lyssechko.AbstractFactory;

public interface AbstractFactory {
    InvokerWithLandCast createLandCast();

    InvokerWithAirCast createAirCast();
}
