package baseball.domain.state;

public interface GameState {

    GameState startGame();

    GameState EndGame();

    boolean isRunning();
}
