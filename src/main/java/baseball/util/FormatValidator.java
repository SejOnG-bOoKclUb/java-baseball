package baseball.util;

public class FormatValidator {
    private FormatValidator() {
    }

    public static boolean canStringToInt(String str) {
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
