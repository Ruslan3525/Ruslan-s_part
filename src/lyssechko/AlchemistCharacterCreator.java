package lyssechko;

public class AlchemistCharacterCreator implements CharacterCreator {
    @Override
    public Character createCharacter() {
        return new AlchemistCharacter();
    }
}
