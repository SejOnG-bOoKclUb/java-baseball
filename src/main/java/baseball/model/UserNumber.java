package baseball.model;

import baseball.utils.Convert;
import baseball.utils.validation.UserNumberValidator;
import java.util.List;

public class UserNumber {

    private final List<Integer> userNumber;

    public UserNumber(String inputNumbers) {
        new UserNumberValidator().validate(inputNumbers);
        List<Integer> userNumber = Convert.convertStringToList(inputNumbers);
        this.userNumber = userNumber;
    }
}
