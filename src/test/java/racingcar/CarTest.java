package racingcar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.util.RandomGenerator;

import static org.assertj.core.api.Assertions.assertThat;

class CarTest {
    Car car;

    @BeforeEach
    void setUp() {
        car = new Car(new RandomNumberMovingStrategy(RandomGenerator.getInstance()), "pobi");
    }

    @Test
    void 랜덤값이_4이상이면_전진() {
        car.move(() -> true);
        int expectedCarPosition = 2;
        assertThat(car.getPosition()).isEqualTo(expectedCarPosition);
    }

    @Test
    void 랜덤값이_3_이하면_멈춤() {
        car.move(() -> false);
        int expectedCarPosition = 1;
        assertThat(car.getPosition()).isEqualTo(expectedCarPosition);
    }
}