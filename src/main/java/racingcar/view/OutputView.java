package racingcar.view;

public class OutputView {
	private static final String INPUTTING_CARS_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String INPUTTING_TRIAL_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";

	public static void printCarsNameMessage() {
		System.out.println(INPUTTING_CARS_MESSAGE);
	}

	public static void printTrialCountMessage() {
		System.out.println(INPUTTING_TRIAL_MESSAGE);
	}
}
