package baseball.view;

public class OutputView {

    public static void startGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public static void printStrikeAndBall(int strike, int ball) {
        StringBuilder stringBuilder = new StringBuilder();
        if (ball > 0) {
            stringBuilder.append(ball);
            stringBuilder.append("볼 ");
        }
        if (strike > 0) {
            stringBuilder.append(strike);
            stringBuilder.append("스트라이크");
        }
        if (ball == 0 && strike == 0) {
            stringBuilder.append("낫싱");
        }
        if (strike == 3) {
            stringBuilder.append("\n3개의 숫자를 모두 맞히셨습니다! 게임 종료\n"
                    + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요");
        }
        System.out.println(stringBuilder);
    }
}
