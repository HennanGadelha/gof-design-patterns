package FactoryMethod.characters;

import FactoryMethod.Character;
import FactoryMethod.GameCharacterFactory;

public class WizardCharacterFactory extends GameCharacterFactory {
    @Override
    protected Character generateCharacter() {
        return new Character(CharacterClass.WIZARD, 20, 9);
    }
}
