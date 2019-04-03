import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Starship> fleet = new ArrayList<>();

        String[] names = new String[]{"Pillar of Autumn","Prophecy","Song of East","Valiant","Unto the Breach","Aegis Fate","Allegiance","Forward Unto Dawn","Tripping Light","Ready or Not","Calcutta","Halberd","Jericho","Resolute","Do You Feel Lucky?","Callisto","Coral Sea","Pony Express","Two for Flinching","Glamorgan"};

        for(int i = 0; i < 20; i++){
            if (i < 5){
                fleet.add(new Escort(names[i]));

            }
            else if (i >= 5 && i < 10){
                fleet.add(new Frigate(names[i]));

            }
            else if (i <= 10 && i < 15){
                fleet.add(new Cruiser(names[i]));

            }
            else if (i >= 15 && i < 20){
                fleet.add(new Battleship(names[i]));
            }
        }

        for(Starship i : fleet){
            i.showStats();
        }

    }

}
