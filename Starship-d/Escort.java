public class Escort extends Starship implements IsDefense {

    public Escort(String newName){
        name = newName;
        hull = randomGen(1250,1000);
        shield = randomGen(3500,2500);
        beam = randomGen(3000,2500);
        torp = randomGen(20,10);
    }
    public void showStats() {
        System.out.println(name);
        System.out.println("--------------------");
        System.out.println("Hull: " + hull + " Shields: " + shield + " Beams: " + beam + " Torpedoes: "+ torp);
        System.out.println();
    }
}
