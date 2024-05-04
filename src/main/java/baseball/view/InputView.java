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

    public boolean isNotThreeDigitNumber(String input) {
        return input.matches("\\D|\\d{1,2}|\\d{4,}");
    }
}
