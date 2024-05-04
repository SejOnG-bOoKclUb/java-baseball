package baseball.domain;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InputNumberGeneratorTest {

    @ParameterizedTest
    @DisplayName("입력으로 들어온 문자열을 리스트 형태로 반환한다.")
    @ValueSource(strings = {"123", "456", "789"})
    void inputThreeDigit(String input) throws Exception {
        List<Integer> threeDigitNumber = InputNumberGenerator.generate(input);

        Assertions.assertAll(
                () -> Assertions.assertEquals(
                        Character.getNumericValue(input.charAt(0)), threeDigitNumber.get(0)),
                () -> Assertions.assertEquals(
                        Character.getNumericValue(input.charAt(1)), threeDigitNumber.get(1)),
                () -> Assertions.assertEquals(
                        Character.getNumericValue(input.charAt(2)), threeDigitNumber.get(2))
        );
    }

}