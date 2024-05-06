package baseball.domain;

import java.util.List;
import java.util.stream.Collectors;

public class InputNumberGenerator {

    public static List<Integer> generate(String input) {

        return input.chars()
                .mapToObj(Character::getNumericValue)
                .collect(Collectors.toList());
    }
}
