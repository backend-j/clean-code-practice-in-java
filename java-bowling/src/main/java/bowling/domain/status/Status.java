package bowling.domain.status;

public interface Status {


    Status bowl(int downPin);

    String printResult();

    boolean canPlayMore();

    boolean isClearAllPins();

}
