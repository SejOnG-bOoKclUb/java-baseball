package baseball.utils;

import java.util.ArrayList;
import java.util.List;

public class Convert {

    public static List<Integer> convertStringToList(String input){
        List<Integer> result = new ArrayList<>();
        String[] split = input.split("");
        for (String s : split) {
            result.add(Integer.parseInt(s));
        }
        return result;
    }

}
