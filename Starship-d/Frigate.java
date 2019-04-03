public class Frigate extends Starship implements IsDefense {

    public Frigate(String newName){
        name = newName;
        hull = randomGen(2000,1500);
        shield = randomGen(2500,2000);
        beam = randomGen(3500,2500);
        torp = randomGen(30,20);
    }
    public void showStats() {
        System.out.println(name);
        System.out.println("--------------------");
        System.out.println("Hull: " + hull + " Shields: " + shield + " Beams: " + beam + " Torpedoes: "+ torp);
        System.out.println();
    }
}
