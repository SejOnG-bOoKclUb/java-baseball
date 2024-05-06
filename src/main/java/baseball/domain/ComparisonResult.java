package baseball.domain;

public record ComparisonResult(int strike, int ball) {

    public Boolean isThreeStrike() {
        return strike == 3;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (ball != 0) {
            stringBuilder.append(ball + "볼 ");
        }
        if (strike != 0) {
            stringBuilder.append(strike + "스트라이크");
        }
        if (ball == 0 && strike == 0) {
            stringBuilder.append("낫싱");
        }
        return stringBuilder.toString();
    }
}
