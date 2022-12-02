package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

	private static final int MAX_NAME_SIZE = 5;
	private static final int MIN_NAME_SIZE = 0;

	private final String name;
	private int position = 0;

	public Car(String name) {
		validateSize(name);
		this.name = name;
	}

	// 추가 기능 구현
	private void validateSize(String name) {
		if (name.length() > MAX_NAME_SIZE || name.length() <= MIN_NAME_SIZE) {
			throw new IllegalArgumentException("[ERROR] 이름 크기");
		}
	}

	public void move() {
		int number = generateNumber();
		if (checkCondition(number)) {
			position++;
		}
	}

	private int generateNumber() {
		return Randoms.pickNumberInRange(0, 9);
	}

	private boolean checkCondition(int number) {
		return number >= 4;
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}
}
