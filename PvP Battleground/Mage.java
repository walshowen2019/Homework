import java.util.Random;

public class Mage extends PlayerCharacter {
    private int wisdom;

    public Mage(String newName) {
        name = newName;
        Random rand = new Random();

        strength = 7 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        wisdom = 10 + (rand.nextInt(6) + 1);


        hp = hpmax = strength;
        mp = mpmax = intelligence + (2*wisdom);

        System.out.println(name + " has joined the battle!");
    }

    public void showStats() {
        super.showStats();
        System.out.println(" WIS | " + wisdom);
    }
}
