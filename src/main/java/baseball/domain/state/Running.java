package baseball.domain.state;

public class Running implements GameState {

    @Override
    public GameState startGame() {
        throw new IllegalArgumentException("이미 시작함");
    }

    @Override
    public GameState EndGame() {
        return new Terminate();
    }

    @Override
    public boolean isRunning() {
        return true;
    }
}
