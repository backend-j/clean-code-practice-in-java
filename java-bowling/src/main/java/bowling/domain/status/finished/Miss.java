package bowling.domain.status.finished;

import bowling.domain.frame.Pins;
import bowling.domain.status.Finished;

public class Miss extends Finished {
    private Pins firstPin;
    private Pins secondPin;

    public Miss(Pins firstPin, Pins secondPin) {
        this.firstPin = firstPin;
        this.secondPin = secondPin;
    }

    @Override
    public String printResult() {
        return firstPin.printPinCount() + "|" + secondPin.printPinCount();
    }

    @Override
    public boolean isClearAllPins() {
        return false;
    }

}
