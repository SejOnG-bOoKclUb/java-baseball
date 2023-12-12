package baseball.controller;

import baseball.model.UserNumber;

public class GameController {

    private final UserNumber userNumber;

    public GameController() {
        this.userNumber = InputController.makeUserNumbers();
    }


}
