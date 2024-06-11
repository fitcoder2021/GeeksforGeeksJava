package java8;

import java.util.Arrays;
import java.util.List;

public class FindOutAllnoStart1 {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(20,15,16,18,24);
        ls.stream()
                .map(s->s+ "")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);
    }
}
