package racing.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class CarsTest {

	@DisplayName("우승자 한명")
	@Test
	void winner() {
		Car a = new Car(new Name("a"));
		Car b = new Car(new Name("b"));
		List<Car> carList = new ArrayList<>(Arrays.asList(a, b));
		Cars cars = new Cars(carList);

		a.move(true);

		Assertions.assertThat(cars.getWinners()).containsExactly(a);
	}

	@DisplayName("우승자 여러명")
	@Test
	void winners() {
		Car a = new Car(new Name("a"));
		Car b = new Car(new Name("b"));
		List<Car> carList = new ArrayList<>(Arrays.asList(a, b));
		Cars cars = new Cars(carList);

		a.move(true);
		b.move(true);

		Assertions.assertThat(cars.getWinners()).containsExactly(a, b);
	}
}
