package racingcar.domain;

import java.util.Arrays;
import java.util.Comparator;
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

	public List<Car> getCars() {
		return cars;
	}

	public List<String> getWinner() {
		int maxPosition = cars.stream()
			.map(Car::getPosition)
			.max(Comparator.comparingInt(position -> position))
			.get();

		return cars.stream()
			.filter(car -> car.SamePosition(maxPosition))
			.map(Car::getName)
			.collect(Collectors.toList());

	}
}
