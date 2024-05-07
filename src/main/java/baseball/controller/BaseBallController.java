package baseball.controller;

import baseball.domain.game.BaseBallGame;
import baseball.domain.state.GameState;
import baseball.domain.state.InitGame;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BaseBallController {

    private final InputView inputView;
    private final OutputView outputView;
    private GameState gameState;

    public BaseBallController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
        gameState = new InitGame().startGame();
    }

    public void run() {
        BaseBallGame baseBallGame = new BaseBallGame();
        while (gameState.isRunning()) {
            playOneGame(baseBallGame);
        }
        wantRetry();
    }

    private void playOneGame(BaseBallGame baseBallGame) {
        List<Integer> numbers = inputView.inputNumber();
        printResult(baseBallGame, numbers);

        if (baseBallGame.isAnswer(numbers)) {
            gameState = gameState.EndGame();
            outputView.printMatchAnswer();
        }
    }

    private void printResult(BaseBallGame baseBallGame, List<Integer> numbers) {
        int strike = baseBallGame.countStrike(numbers);
        int ball = baseBallGame.countBall(numbers);
        outputView.printResult(strike, ball);
    }

    private void wantRetry() {
        if (inputView.inputRetry()) {
            gameState = gameState.startGame();
            run();
        }
    }
}
