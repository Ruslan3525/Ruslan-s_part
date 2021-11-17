package lyssechko;

public class InvokerCharacterCreator implements CharacterCreator {
    @Override
    public Character createCharacter() {
        return new InvokerCharacter();
    }
}
