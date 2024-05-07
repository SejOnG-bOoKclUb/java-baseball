package baseball.domain.game;

import java.util.List;

public class Strike {

    private final List<Integer> computerNumbers;

    public Strike(List<Integer> computerNumbers) {
        this.computerNumbers = computerNumbers;
    }

    public boolean isStrike(int matchNumber, int position) {
        if (hasNumber(matchNumber)) {
            return isSamePosition(matchNumber, position);
        }
        return false;
    }

    private boolean isSamePosition(int matchNumber, int position) {
        return position == getPosition(matchNumber);
    }

    public boolean hasNumber(int matchNumber) {
        return computerNumbers.contains(matchNumber);
    }

    public int getPosition(int matchNumber) {
        return computerNumbers.indexOf(matchNumber);
    }
}


