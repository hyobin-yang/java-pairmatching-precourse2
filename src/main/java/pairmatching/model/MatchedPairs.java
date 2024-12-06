package pairmatching.model;

import java.util.List;

public class MatchedPairs {
    private final Option option;
    private final List<List<String>> pairs;

    public MatchedPairs(Option option, List<List<String>> pairs){
        this.option = option;
        this.pairs = pairs;
    }
}
