package racingcar.service;

import racingcar.domain.Cars;

public class RacingGame {

	private final Cars cars;
	private final int trialCount;

	public RacingGame(Cars cars, int trialCount) {
		this.cars = cars;
		this.trialCount = trialCount;
	}

}
