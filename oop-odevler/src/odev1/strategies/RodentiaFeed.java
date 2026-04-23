package odev1.strategies;

import odev1.interfaces.FeedStrategy;

public class RodentiaFeed implements FeedStrategy {
    @Override
    public String getSchedule() {
        return "odev1.animals.Rodentia's should eat 3 times in a day.";
    }
}
