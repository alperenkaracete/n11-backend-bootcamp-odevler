package odev1.strategies;

import odev1.interfaces.FeedStrategy;

public class HorsesFeed implements FeedStrategy {
    @Override
    public String getSchedule() {
        return "odev1.animals.Horses should eat 3 times in a day.";
    }
}
