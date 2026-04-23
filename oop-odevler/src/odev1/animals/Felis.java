package odev1.animals;

import odev1.abstracts.Animal;
import odev1.interfaces.DosageStrategy;
import odev1.interfaces.FeedStrategy;

public class Felis extends Animal {

    public Felis(String name, double weight, int age, DosageStrategy dosageStrategy, FeedStrategy feedStrategy) {
        super(name, weight, age, dosageStrategy, feedStrategy);
    }
}
