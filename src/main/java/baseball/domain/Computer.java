package baseball.domain;

import java.util.List;

public class Computer {

    private final List<Integer> answer;

    public Computer(List<Integer> answer) {
        this.answer = answer;
    }

    public ComparisonResult compare(List<Integer> input) {

        return new ComparisonResult(findStrike(input), findBall(input));
    }

    private int findStrike(List<Integer> input) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (answer.get(i) == input.get(i)) {
                strike++;
            }
        }
        return strike;
    }

    private int findBall(List<Integer> input) {
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (answer.get(i) == input.get(i)) {
                continue;
            }
            if (answer.contains(input.get(i))) {
                ball++;
            }
        }
        return ball;
    }
}
