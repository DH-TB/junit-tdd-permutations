import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public static List<String> game(String str) {

        if (str.length() <= 1) {
            return Arrays.asList(str);
        }
        else {
            List<String> result = new ArrayList<>();
            Integer lengths = 1;
            for (int i = 1; i < str.length(); i++) {
                lengths = lengths * i;
            }

            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < lengths; j++) {
                    result.add(str.charAt(i) + game(removeByIndex(str, i)).get(j));
                }
            }
            return result;
        }
    }

    private static String removeByIndex(String input, Integer index) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (i == index) {
                continue;
            }
            result += input.charAt(i);
        }
        return result;
    }
}
