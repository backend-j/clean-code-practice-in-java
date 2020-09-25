package bowling.domain.status.running;

import bowling.domain.frame.Pins;
import bowling.domain.status.Running;
import bowling.domain.status.Status;
import bowling.domain.status.finished.Miss;
import bowling.domain.status.finished.Spare;

public class Pending extends Running {
    private Pins firstPin;

    public Pending(Pins firstPin) {
        this.firstPin = firstPin;
    }

    @Override
    public Status bowl(int downPin) {
        if (firstPin.isSpare(downPin)) {
            return new Spare(firstPin);
        }
        return new Miss(firstPin, Pins.down(downPin));
    }

    @Override
    public String printResult() {
        return firstPin.printPinCount();
    }

    @Override
    public boolean isClearAllPins() {
        return false;
    }

}
