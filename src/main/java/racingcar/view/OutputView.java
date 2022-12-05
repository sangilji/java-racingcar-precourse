package racingcar.view;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import racingcar.domain.Car;
import racingcar.domain.Cars;

public class OutputView {
	private static final String INPUTTING_CARS_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String INPUTTING_TRIAL_MESSAGE = "시도할 횟수는 몇회인가요?";
	private static final String PROGRESS_RESULT_MESSAGE = "실행결과";
	private static final String CAR_RESULT = "%s : %s\n";
	private static final String STREET = "-";
	private static final String FINAL_WINNERS = "최종 우승자 : %s\n";

	public static void printCarsNameMessage() {
		System.out.println(INPUTTING_CARS_MESSAGE);
	}

	public static void printTrialCountMessage() {
		System.out.println(INPUTTING_TRIAL_MESSAGE);
	}

	public static void printResultMessage() {
		System.out.println(PROGRESS_RESULT_MESSAGE);
	}

	public static void printCurrentResult(Cars cars) {
		for (Car car : cars.getCars()) {
			String rail = IntStream.range(0, car.getPosition())
				.mapToObj(position -> STREET)
				.collect(Collectors.joining());
			System.out.printf(CAR_RESULT, car.getName(), rail);
		}
		System.out.println();
	}

	public static void printWinner(List<String> winners) {
		String winnersName = String.join(", ", winners);
		System.out.printf(FINAL_WINNERS, winnersName);
	}
}
