package javahungry;

import java.util.Arrays;
import java.util.List;

public class FindoutAllnoStart1 {

    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10,30,50,22,15);
        ls.stream()
                .map(s-> s + "")
                .filter(s->s.startsWith("1"))
                .forEach(System.out::println);

    }
}
