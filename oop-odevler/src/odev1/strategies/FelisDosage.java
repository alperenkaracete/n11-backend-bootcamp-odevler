package odev1.strategies;

import odev1.interfaces.DosageStrategy;

public class FelisDosage implements DosageStrategy {
    @Override
    public double calculateDosage(double weight) {
        return weight * 25/100;
    }
}
