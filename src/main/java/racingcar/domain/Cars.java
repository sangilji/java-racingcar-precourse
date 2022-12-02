package racingcar.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
	private static final String SEPARATOR = ",";


	private final List<Car> cars;

	public Cars(String cars) {
		this.cars = Arrays.stream(cars.split(SEPARATOR))
			.map(Car::new)
			.collect(Collectors.toList());
	}
}
