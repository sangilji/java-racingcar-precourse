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
		for (String name : names) {
			if (name.length() > MAX_NAME_SIZE || name.length() <= MIN_NAME_SIZE) {
				throw new IllegalArgumentException("[ERROR] 이름 크기");
			}
		}
		return carNames;
	}
}
