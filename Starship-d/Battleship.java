public class Battleship extends Starship implements IsOffense {

    public Battleship(String newName){
        name = newName;
        hull = randomGen(5000,3000);
        shield = randomGen(2000,1500);
        beam = randomGen(5000,4000);
        torp = randomGen(50,40);
    }

    public void showStats() {
        System.out.println(name);
        System.out.println("--------------------");
        System.out.println("Hull: " + hull + " Shields: " + shield + " Beams: " + beam + " Torpedoes: "+ torp);
        System.out.println();
    }
}


