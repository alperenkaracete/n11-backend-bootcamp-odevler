package odev1.strategies;

import odev1.interfaces.DosageStrategy;

public class HorsesDosage implements DosageStrategy {
    @Override
    public double calculateDosage(double weight) {
        return weight * 40/100;
    }
}
