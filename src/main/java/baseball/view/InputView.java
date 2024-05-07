package baseball.view;

import baseball.util.FormatValidator;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    private static final String GAME_START = "숫자 야구 게임을 시작합니다.";
    private static final String INPUT_GAME_NUMBER = "숫자를 입력해주세요 : ";

    public static void startMessage() {
        System.out.println(GAME_START);
    }

    public static int inputPredictNumber() {
        System.out.println(GAME_START);
        System.out.println(INPUT_GAME_NUMBER);
        String gameNumber = Console.readLine();

        if (!FormatValidator.canStringToInt(gameNumber)) {
            inputPredictNumber();
        }
        return Integer.parseInt(gameNumber);
    }

}

