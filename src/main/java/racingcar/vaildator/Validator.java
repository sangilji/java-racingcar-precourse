package racingcar.vaildator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Validator {

	private static final int MAX_NAME_SIZE = 5;
	private static final int MIN_NAME_SIZE = 0;

	public static String validateNames(String carNames) {
		List<String> names = Arrays.stream(carNames.split(","))
			.collect(Collectors.toList());
		checkComma(names);
		checkName(names);
		emptyCars(names);
		return carNames;
	}

	private static void checkComma(List<String> names) {
		boolean containComma = names.stream()
			.anyMatch(name -> name.contains(","));
		if (containComma) {
			throw new IllegalArgumentException("[ERROR] 자동차 이름은 쉼표로 구분지어야 합니다.");
		}
	}

	private static void checkName(List<String> names) {
		for (String name : names) {
			if (name.length() > MAX_NAME_SIZE || name.length() <= MIN_NAME_SIZE) {
				throw new IllegalArgumentException("[ERROR] 자동차 이름의 길이는 1자 이상 5자 이하여야합니다.");
			}
		}
	}

	private static void emptyCars(List<String> names) {
		if (names.isEmpty()) {
			throw new IllegalArgumentException("[ERROR] 자동차는 1대 이상 있어야 합니다.");
		}
	}

	public static int checkTrialCount(String trialInput) {
		if (trialInput.matches("^[1-9]+[0-9]*$")) {
			return Integer.parseInt(trialInput);
		}
		throw new IllegalArgumentException("[ERROR] 시도할 횟수는 1이상의 숫자여야 합니다.");
	}

	public static List<String> checkWinner(List<String> names) {
		if (names.isEmpty()) {
			throw new IllegalArgumentException("[ERROR] 우승자는 1명 이상 존재해야 합니다.");
		}
		return names;
	}
}
