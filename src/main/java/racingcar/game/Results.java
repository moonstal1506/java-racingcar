package racingcar.game;

import java.util.ArrayList;
import java.util.List;

public class Results {
    private List<Result> results;

    private Results() {
        results = new ArrayList<>();
    }

    public static Results newInstance() {
        return new Results();
    }

    public void add(Result result) {
        this.results.add(result);
    }

    public List<Result> getResults() {
        return results;
    }
}
