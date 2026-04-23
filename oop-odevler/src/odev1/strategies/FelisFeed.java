package odev1.strategies;

import odev1.interfaces.FeedStrategy;

public class FelisFeed implements FeedStrategy {
    @Override
    public String getSchedule() {
        return "Cats should eat 2 times in a day";
    }
}
