package baseball.controller;

import baseball.model.ComputerNumber;
import baseball.model.UserNumber;
import baseball.view.OutputView;
import java.util.List;

public class GameController {

    private final UserNumber userNumber;
    private List<Integer> computerNumber;

    public GameController() {
        this.userNumber = InputController.makeUserNumbers();
        this.computerNumber = new ComputerNumber().makeComputerNumber();
    }

    public void startGame() {
        int countStrike = userNumber.countStrike(computerNumber);
        int countBall = userNumber.countBall(computerNumber);
        if (countBall != 0 || countStrike != 0) {
            OutputView.printStrikeAndBall(countStrike, countBall);
        }
        if (countBall == 0 && countStrike == 0) {
            OutputView.printNothing();
        }
    }

}
