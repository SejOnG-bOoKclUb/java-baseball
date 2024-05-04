package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomNumberGeneratorTest {

    @Test
    @DisplayName("3자리 랜덤한 숫자를 리스트로 반환")
    void randomThreeDigit() throws Exception {
        List<Integer> randomThreeDigit = RandomNumberGenerator.generate();

        Assertions.assertEquals(randomThreeDigit.size(), 3);
    }

}