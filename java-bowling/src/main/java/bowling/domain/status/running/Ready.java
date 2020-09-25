package bowling.domain.status.running;

import bowling.domain.frame.Pins;
import bowling.domain.status.Running;
import bowling.domain.status.Status;
import bowling.domain.status.finished.Strike;

public class Ready extends Running {
    @Override
    public Status bowl(int downPin) {
        Pins pins = Pins.down(downPin);
        if (pins.isClearAllPins()) {
            return new Strike();
        }
        return new Pending(pins);
    }

    @Override
    public String printResult() {
        return "";
    }

    @Override
    public boolean isClearAllPins() {
        return false;
    }

}
