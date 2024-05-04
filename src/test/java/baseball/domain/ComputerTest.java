package baseball.domain;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerTest {

    private Computer computer;

    @BeforeEach
    void before() {
        computer = new Computer(List.of(1, 2, 3));
    }

    @Test
    @DisplayName("입력 리스트를 받아 2볼 1스트라이크를 반환한다.")
    void compare2Ball1Strike() throws Exception {
        List<Integer> input = List.of(1, 3, 2);

        ComparisonResult result = computer.compare(input);
        Assertions.assertEquals(result.toString(), "2볼 1스트라이크");
    }

    @Test
    @DisplayName("입력을 받아 낫싱을 출력한다.")
    void compareNothing() throws Exception {
        List<Integer> input = List.of(4, 5, 6);

        ComparisonResult result = computer.compare(input);
        Assertions.assertEquals(result.toString(), "낫싱");
    }


    @Test
    @DisplayName("입력을 받아 3스트라이크를 출력한다.")
    void compare3Strike() throws Exception {
        List<Integer> input = List.of(1, 2, 3);

        ComparisonResult result = computer.compare(input);
        Assertions.assertEquals(result.toString(), "3스트라이크");
    }
}