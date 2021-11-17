package lyssechko.AbstractFactory;

public class Executor {
    public static void main(String[] args) {
        AbstractFactory factory = new InitialGameFactory();
        InvokerWithLandCast invokerWithLandCast = factory.createLandCast();
        invokerWithLandCast.attackFromGround();
        factory = new LateGameFactory();
        invokerWithLandCast = factory.createLandCast();
        invokerWithLandCast.attackFromGround();
    }
}
