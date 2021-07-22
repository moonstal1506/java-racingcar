package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StateTest {
    @DisplayName("기존 State에서 result와 type만 바꿔서 새로 State를 반환한다")
    @Test
    void changeTypeAndResult(){
        //given
        CalculatorState state = CalculatorState.makeDefaultState();

        //when
        CalculatorState result = CalculatorState.changeTypeAndResult(state, Formula.ConfigurationType.NUMBER, 1);

        //then
        assertThat(result).isEqualTo(new CalculatorState(Formula.ConfigurationType.NUMBER, 1, null));
    }

    @DisplayName("기존 State에서 operator와 type만 바꿔서 새로 State를 반환한다")
    @Test
    void changeTypeAndOperator(){
        //given
        CalculatorState state = CalculatorState.makeDefaultState();

        //when
        CalculatorState result = CalculatorState.changeTypeAndOperator(state, Formula.ConfigurationType.OPERATOR, Operator.DIVIDE);

        //then
        assertThat(result).isEqualTo(new CalculatorState(Formula.ConfigurationType.OPERATOR, 0, Operator.DIVIDE));
    }

    @DisplayName("기본 State생성자에는 Formula.ConfigurationType이 None이며 result는 0 Operator는 null이다")
    @Test
    void makeDefaultState(){
        //given, when
        CalculatorState state = CalculatorState.makeDefaultState();

        //then
        assertAll(
                () -> assertThat(state.getType()).isEqualTo(Formula.ConfigurationType.NONE),
                () -> assertThat(state.getOperator()).isNull(),
                () -> assertThat(state.getResult()).isEqualTo(0)
        );
    }
}