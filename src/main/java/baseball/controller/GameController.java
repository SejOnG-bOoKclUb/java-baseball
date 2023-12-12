package baseball.controller;

import baseball.model.ComputerNumber;
import baseball.model.UserNumber;
import baseball.view.OutputView;
import java.util.List;

public class GameController {

    public void startGame() {
        do {
            List<Integer> computerNumber = new ComputerNumber().makeComputerNumber();
            doOneGame(computerNumber);
        } while (InputController.isRestart());
    }

    private void doOneGame(List<Integer> computerNumber) {
        while (true) {
            UserNumber userNumber = InputController.makeUserNumbers();
            int countStrike = userNumber.countStrike(computerNumber);
            int countBall = userNumber.countBall(computerNumber);
            OutputView.printStrikeAndBall(countStrike, countBall);
            if (countStrike == 3) {
                break;
            }
        }
    }
}
