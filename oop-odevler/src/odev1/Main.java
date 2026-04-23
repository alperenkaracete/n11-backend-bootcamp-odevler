package odev1;

import odev1.animals.Felis;
import odev1.animals.Horses;
import odev1.animals.Rodentia;
import odev1.strategies.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double felis1weight = 6;
        FelisDosage felisDosage1 = new FelisDosage();
        felisDosage1.calculateDosage(felis1weight);
        FelisFeed felisFeed = new FelisFeed();

        double horse1weight = 150;
        HorsesDosage horsesDosage1 = new HorsesDosage();
        horsesDosage1.calculateDosage(horse1weight);
        HorsesFeed horsesFeed = new HorsesFeed();

        double rodentia1weight = 3;
        RodentiaDosage rodentiaDosage1 = new RodentiaDosage();
        rodentiaDosage1.calculateDosage(rodentia1weight);
        RodentiaFeed rodentiaFeed = new RodentiaFeed();

        Felis felis1 = new Felis("British Fold",felis1weight,5,felisDosage1,felisFeed);
        Horses horse1 = new Horses("English Horse",horse1weight,10,horsesDosage1,horsesFeed);
        Rodentia rodentia1 = new Rodentia("Hamster",rodentia1weight,3,rodentiaDosage1,rodentiaFeed);

        felis1.getFeedSchedule();
        felis1.getDosage();

        horse1.getFeedSchedule();
        horse1.getDosage();

        rodentia1.getFeedSchedule();
        rodentia1.getDosage();
    }
}