package FactoryMethod;

import FactoryMethod.characters.CharacterClass;

public class Character {

    private CharacterClass characterClass;
    private Integer powerAtk;
    private  Integer powerDef;

    public Character(CharacterClass characterClass, Integer powerAtk, Integer powerDef) {
        this.characterClass = characterClass;
        this.powerAtk = powerAtk;
        this.powerDef = powerDef;
    }


    @Override
    public String toString() {
        return "Character{" +
                "characterClass=" + characterClass +
                ", powerAtk=" + powerAtk +
                ", powerDef=" + powerDef +
                '}';
    }
}
