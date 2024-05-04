package baseball;

import baseball.controller.BullsAndCowsController;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        new BullsAndCowsController(new InputView(), new OutputView()).run();
    }
}
