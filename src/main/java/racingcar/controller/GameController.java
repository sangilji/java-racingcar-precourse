package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.service.RacingGame;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class GameController {

	private RacingGame racingGame;

	public void run() {
		setting();
	}

	private void setting() {
		OutputView.printCarsNameMessage();
		Cars cars = new Cars(InputView.inputCars());

		OutputView.printTrialCountMessage();
		int trialCount = InputView.inputTrialCount();
		racingGame = new RacingGame(cars, trialCount);
	}
}
