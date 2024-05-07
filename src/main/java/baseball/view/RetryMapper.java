package baseball.view;

import java.util.Arrays;

public enum RetryMapper {
    Yes(1, true),
    No(2, false),
    ;

    final int retryNumber;
    final boolean flag;

    RetryMapper(int retryNumber, boolean flag) {
        this.retryNumber = retryNumber;
        this.flag = flag;
    }

    public static boolean isRetry(int retryNumber) {
        return Arrays.stream(values())
                .filter(value -> value.retryNumber == retryNumber)
                .findFirst()
                .map(value -> value.flag)
                .orElseThrow(() -> new IllegalArgumentException("1이나 2 중에 입력하라고"));
    }
}
