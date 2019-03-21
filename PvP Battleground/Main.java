import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<PlayerCharacter> characters = new ArrayList<PlayerCharacter>();

        Fighter fighter = new Fighter("Severil");
        characters.add(fighter);
        fighter.showStats();

        Mage mage = new Mage("Ahri");
        characters.add(mage);
        mage.showStats();

        Priest priest = new Priest("Anduin");
        characters.add(priest);
        priest.showStats();

        Paladin paladin = new Paladin("Poppy");
        characters.add(paladin);
        paladin.showStats();

    }

}
