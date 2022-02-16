package racingcar.domain;

import java.util.List;

public class RacingGame {
    private final Cars cars;
    private final NumberGeneratePolicy numberGeneratePolicy;
    private Round round;

    public RacingGame(Cars cars, Round round, NumberGeneratePolicy numberGeneratePolicy) {
        this.cars = cars;
        this.round = round;
        this.numberGeneratePolicy = numberGeneratePolicy;
    }

    public List<Car> race() {
        cars.driveAll(numberGeneratePolicy);
        return cars.getDriveRecord();
    }

    public boolean isFinished() {
        if (this.round.isPositiveNumber()) {
            this.round = round.reduce();
            return true;
        }
        return false;
    }

    public RacingResult getRacingResult() {
        return new RacingResult(cars.getWinners());
    }
}
