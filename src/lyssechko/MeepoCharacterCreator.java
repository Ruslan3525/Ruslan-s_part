package lyssechko;

public class MeepoCharacterCreator implements CharacterCreator {
    @Override
    public Character createCharacter() {
        return new MeepoCharacter();
    }
}
