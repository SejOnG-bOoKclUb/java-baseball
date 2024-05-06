package baseball.view;

import baseball.domain.ComparisonResult;

public class OutputView {

    public void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printNumberRequestMessage() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printResult(ComparisonResult result) {
        System.out.println(result);
    }

    public void printEndGameMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }

    public void printRestartMessage() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
