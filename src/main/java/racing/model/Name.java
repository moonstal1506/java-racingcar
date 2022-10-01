package racing.model;

import java.util.Objects;

public class Name {

	private static final int MAX_NAME_LENGTH = 5;
	private final String name;

	public Name(String name) {
		if (!isValid(name)) {
			throw new IllegalArgumentException("이름은 공백이거나, 5자 이상일 수 없습니다.");
		}
		this.name = name;
	}

	private boolean isValid(String name) {
		return name != null && !name.isEmpty() && name.length() < MAX_NAME_LENGTH;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Name name1 = (Name) o;
		return Objects.equals(name, name1.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
