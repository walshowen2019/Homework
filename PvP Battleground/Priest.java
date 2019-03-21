import java.util.Random;

public class Priest extends PlayerCharacter {
    private int charisma;

    public Priest(String newName) {
        name = newName;
        Random rand = new Random();

        strength = 7 + (rand.nextInt(6) + 1);
        intelligence = 15 + (rand.nextInt(6) + 1);
        agility = 8 + (rand.nextInt(6) + 1);
        charisma = 10 + (rand.nextInt(6) +1);


        hp = hpmax = strength;
        mp = mpmax = intelligence + (charisma*2);

        System.out.println(name + " has joined the battle!");
    }

    public void showStats() {
        super.showStats();
        System.out.println(" CHA | " + charisma);
    }
}
