package baseball.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComparisonResultTest {
    @Test
    @DisplayName("입력과 정답을 받아 스트라이크 볼의 개수를 가진다.")
    void generate() {
        int strike = 1;
        int ball = 1;

        Assertions.assertDoesNotThrow(() ->
                new ComparisonResult(strike, ball));

    }

    @Test
    @DisplayName("3스트라이크일 때 true를 반환한다.")
    void ThreeStrikeTrue() {
        int strike = 3;
        int ball = 0;
        ComparisonResult result = new ComparisonResult(strike, ball);
        Assertions.assertEquals(result.isThreeStrike(), true);
    }

    @Test
    @DisplayName("3스트라이크가 아니면 false를 반환한다.")
    void ThreeStrikeFalse() {
        int strike = 2;
        int ball = 1;
        ComparisonResult result = new ComparisonResult(strike, ball);
        Assertions.assertEquals(result.isThreeStrike(), false);
    }

}