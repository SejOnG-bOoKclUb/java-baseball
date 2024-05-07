package baseball.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class InputView {

    public List<Integer> inputNumber() {
        System.out.println("숫자 입력 ㄱㄱ");
        return parseNumber(Console.readLine());
    }

    public boolean inputRetry() {
        System.out.println("또할꺼?");
        String retry = Console.readLine();
        return RetryMapper.isRetry(Integer.parseInt(retry));
    }

    private List<Integer> parseNumber(String numbers) {
        return Arrays.stream(numbers.split(""))
                .map(Integer::parseInt)
                .toList();
    }
}
