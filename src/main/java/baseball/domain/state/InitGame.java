package baseball.domain.state;

public class InitGame implements GameState {
    @Override
    public GameState startGame() {
        return new Running();
    }

    @Override
    public GameState EndGame() {
        return new Terminate();
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
