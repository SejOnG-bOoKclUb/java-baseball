package baseball.utils.validation;

import baseball.utils.Convert;
import java.util.List;

public class UserNumberValidator {
    public void validate(String inputNumber) {
        isInteger(inputNumber);
    }

    private void isInteger(String inputNumber) {
        if (!inputNumber.matches("^[1-9]*$")) {
            throw new IllegalArgumentException();
        }
    }

    private void isCorrectSize(String inputNumber) {
        List<Integer> userNumbers = Convert.convertStringToList(inputNumber);
        if (userNumbers.size() != 3) {
            throw new IllegalArgumentException();
        }
    }

}
