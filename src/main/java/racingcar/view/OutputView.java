package racingcar.view;

import java.util.stream.Collectors;

import racingcar.domain.Car;
import racingcar.domain.RacingResult;
import racingcar.dto.CarDto;
import racingcar.dto.RecordDto;

public class OutputView {
    private static final String NAME_AND_SCORE_DELIMITER = " : ";
    private static final String DRIVE_SCORE_VIEW = "-";
    private static final String NAME_DELIMITER = ", ";
    private static final String RACE_RECORD_MESSAGE = "실행 결과";
    private static final String RACE_WINNER_MESSAGE = "가 최종 우승했습니다.";

    public static void printRacingRecordHeadLine() {
        System.out.println();
        System.out.println(RACE_RECORD_MESSAGE);
    }

    public static void printRacingRecord(RecordDto racingRecord) {
        for (CarDto carDto : racingRecord.getRacingRecord()) {
            System.out.println(carDto.getName() + NAME_AND_SCORE_DELIMITER + printDash(carDto.getPosition()));
        }
        System.out.println();
    }

    private static String printDash(int position) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < position; i++) {
            stringBuilder.append(DRIVE_SCORE_VIEW);
        }
        return stringBuilder.toString();
    }

    public static void printRacingResult(RacingResult racingResult) {
        System.out.println(appendComma(racingResult) + RACE_WINNER_MESSAGE);
    }

    private static String appendComma(RacingResult racingResult) {
        return racingResult.getRacingRecord().stream()
            .map(Car::getName)
            .collect(Collectors.joining(NAME_DELIMITER));
    }
}
