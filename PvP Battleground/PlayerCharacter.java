public abstract class PlayerCharacter {

    String name;

    int strength, agility, intelligence;

    int hp, hpmax;
    int mp, mpmax;

    public static int count;


    public PlayerCharacter() {
        System.out.println("A new character has been created.");

        count++;
    }

    public void showStats() {
        System.out.println(" HP | " + hp + "/" + hpmax);
        System.out.println(" MP | " + mp + "/" + mpmax);
        System.out.println(" STR | " + strength + " INT | " + intelligence + " AGI | " + agility);

    }


}
