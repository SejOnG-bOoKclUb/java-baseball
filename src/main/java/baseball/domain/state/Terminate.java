package baseball.domain.state;

public class Terminate implements GameState {
    @Override
    public GameState startGame() {
        return new Running();
    }

    @Override
    public GameState EndGame() {
        throw new IllegalArgumentException("이미 끝남");
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
