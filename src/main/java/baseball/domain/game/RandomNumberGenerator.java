package baseball.domain.game;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.IntSupplier;

public class RandomNumberGenerator implements IntSupplier {

    public List<Integer> createComputerNumbers() {
        Set<Integer> numbers = new HashSet<>();
        while (numbers.size() < 3) {
            numbers.add(getAsInt());
        }
        return new ArrayList<>(numbers);
    }

    @Override
    public int getAsInt() {
        return Randoms.pickNumberInRange(1, 9);
    }
}
