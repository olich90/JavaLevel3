package hw5;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    private final ArrayList<Stage> stages;
    private final Object mon;
    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Object getMon() {
        return mon;
    }

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
        this.mon = new Object();
    }
}