package FactoryMethod;

abstract public class GameCharacterFactory {

    public void createCharacter(){
        Character character = this.generateCharacter();
        System.out.println("Character Created: " +  character.toString());
    }

    protected abstract Character generateCharacter();

}
