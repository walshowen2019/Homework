import java.util.Random;

public class Paladin extends PlayerCharacter {
    private int constitution;
    private int wisdom;

    public Paladin(String newName) {
        name = newName;
        Random rand = new Random();

        strength = 7 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        constitution = 10 + (rand.nextInt(6) + 1);
        wisdom = 10 + (rand.nextInt(6) + 1);


        hp = hpmax = (strength * 2) + (constitution * 2);
        mp = mpmax = intelligence + (wisdom * 2);

        System.out.println(name + " has joined the battle!");
    }

    public void showStats() {
        super.showStats();
        System.out.println(" CON | " + constitution + " WIS | " + wisdom);
    }
}
