package baseball.controller;

import baseball.model.Computer;
import baseball.view.InputView;

public class GameController {

    private Computer computer;

    public GameController() {

    }
    public void run() {
        InputView.inputPredictNumber();
        makeComputerNumber();
    }

    private void makeComputerNumber() {
        computer = new Computer();
    }
}
