package lyssechko;

import lyssechko.Facade.AdditionalFacade;

public class Main {

    public static void main(String[] args) {
        AdditionalFacade additionalFacade = new AdditionalFacade();
        additionalFacade.attackInvokerWithSpell();
        CharacterCreator creator;
        creator = new InvokerCharacterCreator();
        Character product = creator.createCharacter();
        product.doAbility();
        System.out.println("...");
        additionalFacade.attackAlchemistWithSpell();
        creator = new AlchemistCharacterCreator();
        Character product1 = creator.createCharacter();
        product1.doAbility();
        System.out.println("...");
        additionalFacade.attackMeepoWithSpell();
        creator = new MeepoCharacterCreator();
        Character product2 = creator.createCharacter();
        product2.doAbility();
    }
}
