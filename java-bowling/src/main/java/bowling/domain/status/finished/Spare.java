package bowling.domain.status.finished;

import bowling.domain.frame.Pins;
import bowling.domain.status.Finished;

public class Spare extends Finished {
    private Pins pins;

    public Spare(Pins pins) {
        this.pins = pins;
    }

    @Override
    public String printResult() {
        return pins.printPinCount() + "|/";
    }

    @Override
    public boolean isClearAllPins() {
        return true;
    }

}
