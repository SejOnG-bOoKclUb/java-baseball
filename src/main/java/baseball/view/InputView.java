package baseball.view;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public String scanThreeDigit() {
        String input = scanner.next();
        if (isNotThreeDigitNumber(input)) {
            throw new NumberFormatException("3자리 숫자만 입력되어야 합니다.");
        }
        return input;
    }

    public int scanRestartOrEnd() {
        String input = scanner.next();
        if (isNotOneOrTwo(input)) {
            throw new NumberFormatException("1이나 2만 입력되어야 합니다.");
        }
        return Integer.parseInt(input);
    }

    private boolean isNotThreeDigitNumber(String input) {
        return input.matches("\\D|\\d{1,2}|\\d{4,}");
    }

    private boolean isNotOneOrTwo(String input) {
        return input.matches("[^12]");
    }
}
