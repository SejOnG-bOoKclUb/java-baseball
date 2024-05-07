package baseball;

import baseball.controller.GameController;
import baseball.view.InputView;

public class Application {
    public static void main(String[] args) {
        InputView.startMessage();

        GameController gameController = new GameController();
        gameController.run();
    }
}

/**
 * 큰 메시지를 생각해보자
 * 숫자 야구 게임을 진행해라
 *
 * 진행자(컨트롤러): 게임을 진행할 책임 -> 컴퓨터에게 협력 요청
 *       입력 요청, 출력 요청
 * 컴퓨터: 숫자를 관리할 책임, 랜덤 숫자 생성
 * 플레이어: 3가지 숫자와 게임진행 숫자 관리할 책임
 * 심판: 숫자 비교할 책임
 */