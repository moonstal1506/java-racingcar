package racingCar.model;

import java.util.Objects;

public class Car {
    private static final int CAN_MOVE_NUMBER = 4;
    private static final int CAR_NAME_MAX_LENGTH = 5;

    private String carName;
    private int location = 0;

    public Car(String carName) {
        if (carName.length() > CAR_NAME_MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름은 " + CAR_NAME_MAX_LENGTH + "자를 초과할 수 없습니다.");
        }
        this.carName = carName;
    }

    public boolean canMove(int randomNumber) {
        return randomNumber >= CAN_MOVE_NUMBER;
    }

    public int move(int randomNumber) {
        if (canMove(randomNumber)) {
            location++;
        }
        return location;
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return carName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return location == car.location &&
                Objects.equals(carName, car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, location);
    }
}