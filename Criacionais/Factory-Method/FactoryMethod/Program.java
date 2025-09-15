package FactoryMethod;

import FactoryMethod.characters.ArcherCharacterFactory;
import FactoryMethod.characters.KnightCharacterFactory;
import FactoryMethod.characters.WizardCharacterFactory;

public class Program {

    public static void main(String[] args) {


        System.out.println("===========================Knight===========================");
        System.out.println();
        KnightCharacterFactory knightFactory = new KnightCharacterFactory();
        knightFactory.createCharacter();

        System.out.println();
        System.out.println("===========================Wizard===========================");
        System.out.println();
        WizardCharacterFactory wizardFactory = new WizardCharacterFactory();
        wizardFactory.createCharacter();

        System.out.println();
        System.out.println("===========================Archer===========================");
        System.out.println();
        ArcherCharacterFactory archerFactory = new ArcherCharacterFactory();
        archerFactory.createCharacter();



    }
}
