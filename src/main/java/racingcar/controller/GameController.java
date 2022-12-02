package racingcar.controller;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {

	public void run() {
		OutputView.printCarsNameMessage();
		Cars cars = new Cars(InputView.inputCars());
		OutputView.printTrialCountMessage();
		int trialCount = InputView.inputTrialCount();

		OutputView.printResultMessage();
		for (int trial = 0; trial < trialCount; trial++) {
			move(cars);
			OutputView.printCurrentResult(cars);
		}

	}

	private void move(Cars cars) {
		for (Car car : cars.getCars()) {
			car.move();
		}
	}
}
