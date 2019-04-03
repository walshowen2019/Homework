public class Cruiser extends Starship implements IsOffense {

    public Cruiser(String newName){
        name = newName;
        hull = randomGen(2500,2000);
        shield = randomGen(2500,2000);
        beam = randomGen(4000,3000);
        torp = randomGen(35,20);
    }

    public void showStats() {
        System.out.println(name);
        System.out.println("--------------------");
        System.out.println("Hull: " + hull + " Shields: " + shield + " Beams: " + beam + " Torpedoes: "+ torp);
        System.out.println();
    }
}
