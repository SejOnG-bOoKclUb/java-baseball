package baseball.domain.game;

import java.util.List;
import java.util.stream.IntStream;

public class BaseBallGame {

    private final Strike strike;
    private final Ball ball;

    public BaseBallGame() {
        List<Integer> computerNumbers = new RandomNumberGenerator().createComputerNumbers();
        this.strike = new Strike(computerNumbers);
        this.ball = new Ball(computerNumbers);
    }

    public int countStrike(List<Integer> numbers) {
        return (int) IntStream.range(0, numbers.size())
                .filter(i -> strike.isStrike(numbers.get(i), i))
                .count();
    }

    public int countBall(List<Integer> numbers) {
        return (int) IntStream.range(0, numbers.size())
                .filter(i -> ball.isBall(numbers.get(i), i))
                .count();
    }

    public boolean isAnswer(List<Integer> numbers) {
        return countStrike(numbers) == 3;
    }
}
