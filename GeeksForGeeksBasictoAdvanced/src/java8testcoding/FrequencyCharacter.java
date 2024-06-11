package java8testcoding;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCharacter {
    public static void main(String[] args) {

        String inputString = "Java concept of the day";

        Map<Character, Long> charCountMap = inputString.chars()
                .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(inputString);

    }
}
