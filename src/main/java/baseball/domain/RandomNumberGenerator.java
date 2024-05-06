package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {

    private static final int startRange = 1;
    private static final int endRange = 9;

    public static List<Integer> generate(){
        List<Integer> threeDigitNumber = new ArrayList<>();
        while (threeDigitNumber.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(startRange, endRange);
            if (!threeDigitNumber.contains(randomNumber)) {
                threeDigitNumber.add(randomNumber);
            }
        }
        return threeDigitNumber;
    }
}
