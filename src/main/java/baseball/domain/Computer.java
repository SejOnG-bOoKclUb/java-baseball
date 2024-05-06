package baseball.domain;

import java.util.List;
import java.util.stream.IntStream;

public class Computer {

    private final List<Integer> answer;

    public Computer(List<Integer> answer) {
        this.answer = answer;
    }

    public ComparisonResult compare(List<Integer> input) {
        return new ComparisonResult(findStrike(input), findBall(input));
    }

    private int findStrike(List<Integer> input) {
        return (int) IntStream.range(0, 3)
                .filter(i -> answer.get(i).equals(input.get(i)))
                .count();
    }

    private int findBall(List<Integer> input) {
        return (int) IntStream.range(0, 3)
                .filter(i -> !answer.get(i).equals(input.get(i)) && answer.contains(input.get(i)))
                .count();
    }
}
