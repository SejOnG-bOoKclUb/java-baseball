package baseball.controller;

import baseball.domain.ComparisonResult;
import baseball.domain.Computer;
import baseball.domain.InputNumberGenerator;
import baseball.domain.RandomNumberGenerator;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BullsAndCowsController {

    private final InputView inputView;
    private final OutputView outputView;


    public BullsAndCowsController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        outputView.printStartMessage();
        int restart;
        do {
            playGame();
            outputView.printRestartMessage();
            restart = inputView.scanRestartOrEnd();
        } while (restart == 1);
    }

    private void playGame() {
        Computer computer = initComputer();
        ComparisonResult result;
        do {
            outputView.printNumberRequestMessage();
            result = computer.compare(scanInputNumber());
            outputView.printResult(result);
        } while (!result.isThreeStrike());
        outputView.printEndGameMessage();
    }

    private Computer initComputer() {
        return new Computer(RandomNumberGenerator.generate());
    }

    private List<Integer> scanInputNumber() {
        return InputNumberGenerator.generate(inputView.scanThreeDigit());
    }
}
