import java.util.Random;

public class Fighter extends PlayerCharacter {
    private int constitution;

    public Fighter(String newName) {
        name = newName;
        Random rand = new Random();

        strength = 15 + (rand.nextInt(6) + 1);
        intelligence = 7 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        constitution = 10 + (rand.nextInt(6) + 1);

        hp = hpmax = (strength * 2) + (constitution * 2);
        mp = mpmax = 0;

        System.out.println(name + " has joined the battle!");
    }

    public void showStats() {
        super.showStats();
        System.out.println(" CON | " + constitution);
    }
}
