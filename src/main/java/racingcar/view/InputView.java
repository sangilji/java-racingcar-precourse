package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.vaildator.Validator;

public class InputView {

	public static String inputCars() {
		while (true) {
			try {
				return
					Validator.validateNames(Console.readLine());
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static int inputTrialCount() {
		while (true) {
			try {
				return Integer.parseInt(Console.readLine());
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
