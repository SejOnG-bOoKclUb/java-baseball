package baseball.view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class InputView {

    private Scanner scanner = new Scanner(System.in);
    private final String threeDigitPattern = "^\\d{3}$";
    private final String oneOrTwoPattern = "^(1|2)$";

    public String scanThreeDigit() {
        String input = scanner.next();
        isNotThreeDigitNumber(input);
        return input;
    }

    public int scanRestartOrEnd() {
        String input = scanner.next();
        isNotOneOrTwo(input);
        return Integer.parseInt(input);
    }

    private void isNotThreeDigitNumber(String input) {
        if (!Pattern.matches(threeDigitPattern, input)) {
            throw new NumberFormatException("3자리 숫자만 입력되어야 합니다.");
        }
    }

    private void isNotOneOrTwo(String input) {
        if (!Pattern.matches(oneOrTwoPattern, input)) {
            throw new NumberFormatException("1이나 2만 입력되어야 합니다.");
        }
    }
}
