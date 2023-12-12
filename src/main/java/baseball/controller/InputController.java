package baseball.controller;

import baseball.model.UserNumber;
import baseball.view.InputView;
import java.util.List;

public class InputController {

    public UserNumber makeUserNumbers(){
        String inputNumber = InputView.inputNumber();
        UserNumber userNumber = new UserNumber(inputNumber);

        return userNumber;
    }

}
