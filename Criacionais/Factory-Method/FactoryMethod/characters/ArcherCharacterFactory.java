package FactoryMethod.characters;

import FactoryMethod.Character;
import FactoryMethod.GameCharacterFactory;

public class ArcherCharacterFactory extends GameCharacterFactory {
    @Override
    protected Character generateCharacter() {
        return new Character(CharacterClass.ARCHER, 15, 12);
    }
}
