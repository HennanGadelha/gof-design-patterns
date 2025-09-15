package FactoryMethod.characters;

import FactoryMethod.Character;
import FactoryMethod.GameCharacterFactory;

public class KnightCharacterFactory extends GameCharacterFactory {

    @Override
    protected Character generateCharacter() {
        return new Character(CharacterClass.KNIGHT, 14, 20);
    }
}
