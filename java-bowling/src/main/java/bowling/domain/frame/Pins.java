package bowling.domain.frame;

public class Pins {
    private static final int MIN_COUNT = 0;
    private static final int MAX_PIN_COUNT = 10;

    private int downPin;

    private Pins(int downPin) {
        validate(downPin);
        this.downPin = downPin;
    }

    public static Pins init() {
        return new Pins(MIN_COUNT);
    }

    public static Pins down(int downPin) {
        return new Pins(downPin);
    }

    private void validate(int downPin) {
        if (downPin < MIN_COUNT || downPin > MAX_PIN_COUNT) {
            throw new IllegalArgumentException("투구 값이 유효 범위가 아닙니다.");
        }

    }

    public boolean isClearAllPins() {
        return downPin == MAX_PIN_COUNT;
    }

    public boolean isSpare(int downPin) {
        return this.downPin + downPin == MAX_PIN_COUNT;
    }

    public String printPinCount() {
        if (downPin == MIN_COUNT) {
            return "-";
        }
        return String.valueOf(downPin);
    }
}
