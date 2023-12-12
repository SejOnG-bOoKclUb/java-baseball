package baseball.utils.validation;

public class UserNumberValidator {
    public void validate(String inputNumber) {
        isInteger(inputNumber);
    }

    private void isInteger(String inputNumber) {
        if (!inputNumber.matches("^[1-9]*$")) {
            throw new IllegalArgumentException();
        }
    }

}
