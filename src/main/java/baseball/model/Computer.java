package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;

public class Computer {
    private List<Integer> computer;

    public Computer() {
        makeNumber();
    }

    private void makeNumber() {
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
    }
}
