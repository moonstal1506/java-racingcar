package racing.view;

import java.util.Scanner;

public class InputView {

	public static GameRequest inputGameRequest() {
		try (Scanner scanner = new Scanner(System.in)) {
			return new GameRequest(inputNames(scanner), inputTimes(scanner));
		}
	}

	private static String inputNames(Scanner scanner) {
		System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
		return scanner.nextLine();
	}

	private static int inputTimes(Scanner scanner) {
		System.out.println("시도할 회수는 몇 회 인가요?");
		return scanner.nextInt();
	}
}
