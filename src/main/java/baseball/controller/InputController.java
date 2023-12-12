package baseball.controller;

import baseball.model.UserNumber;
import baseball.view.InputView;

public class InputController {

    public static UserNumber makeUserNumbers() {
        String inputNumber = InputView.inputNumber();
        UserNumber userNumber = new UserNumber(inputNumber);

        return userNumber;
    }

    public static boolean isRestart() {
        String restart = InputView.inputRestart();
        if (restart.equals("1")) {
            return true;
        }
        return false;
    }
}
