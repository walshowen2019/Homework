public abstract class Starship {

    protected int hull;
    protected int shield;
    protected int beam;
    protected int torp;
    protected String name;

    protected int randomGen(int max, int min) {
        return (int)(Math.random() * (max - min)) + min;
    }

    public void showStats() {
        System.out.println(name);
        System.out.println("--------------------");
        System.out.println("Hull: " + hull + " Shields: " + shield + " Beams: " + beam + " Torpedoes: "+ torp);
        System.out.println();
    }
}
