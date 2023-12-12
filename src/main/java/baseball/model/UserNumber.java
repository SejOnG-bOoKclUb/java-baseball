package baseball.model;

import baseball.utils.Convert;
import baseball.utils.validation.UserNumberValidator;
import java.util.List;
import java.util.stream.IntStream;

public class UserNumber {

    private final List<Integer> userNumber;

    public UserNumber(String inputNumbers) {
        new UserNumberValidator().validate(inputNumbers);
        List<Integer> userNumber = Convert.convertStringToList(inputNumbers);
        this.userNumber = userNumber;
    }

    public int countStrike(List<Integer> computerNumber) {
        int strike = 0;
        for (int i = 0; i < 3; i++) {
            if (userNumber.get(i) == computerNumber.get(i)) {
                strike++;
            }
        }
        return strike;
    }

    public int countBall(List<Integer> computerNumber) {
        return (int) IntStream.range(0, 3)
                .flatMap(i -> IntStream.range(0, 3)
                        .filter(j -> i != j && userNumber.get(i).equals(computerNumber.get(j))))
                .count();
    }
}
