package baseball.domain.game;

import java.util.List;

public class Ball {

    private final List<Integer> computerNumbers;

    public Ball(List<Integer> computerNumbers) {
        this.computerNumbers = computerNumbers;
    }

    public boolean isBall(int matchNumber, int position) {
        if (hasNumber(matchNumber)) {
            return isNotSamePosition(matchNumber, position);
        }
        return false;
    }

    private boolean isNotSamePosition(int matchNumber, int position) {
        return position != getPosition(matchNumber);
    }

    public boolean hasNumber(int matchNumber) {
        return computerNumbers.contains(matchNumber);
    }

    public int getPosition(int matchNumber) {
        return computerNumbers.indexOf(matchNumber);
    }
}
