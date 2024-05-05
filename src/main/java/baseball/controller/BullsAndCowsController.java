package baseball.controller;

import static baseball.domain.InputNumberGenerator.generate;

import baseball.domain.ComparisonResult;
import baseball.domain.Computer;
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
            restart = inputView.scanRestartOrEnd();
        } while (restart == 1);
    }

    private void playGame() {
        Computer computer = createComputer();
        ComparisonResult result = null;
        do {
            outputView.printNumberRequestMessage();
            List<Integer> input = generate(inputView.scanThreeDigit());
            result = computer.compare(input);
            outputView.printResult(result);
        } while (!result.isThreeStrike());
        outputView.printEndGameMessage();
    }

    private Computer createComputer() {
        return new Computer(RandomNumberGenerator.generate());
    }
}
