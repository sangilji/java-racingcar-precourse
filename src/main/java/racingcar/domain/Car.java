package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {

	private final String name;
	private int position = 0;

	public Car(String name) {
		this.name = name;
	}

	// 추가 기능 구현
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

	public boolean SamePosition(int maxPosition) {
		return position == maxPosition;
	}
}
