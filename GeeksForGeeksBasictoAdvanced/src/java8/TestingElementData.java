package java8;

import java.util.Arrays;
import java.util.List;

public class TestingElementData {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10,202,30,49,67);

//        ls.stream().findFirst().ifPresent(System.out::println);

        ls.stream().skip(1).findFirst().ifPresent(System.out::println);
    }
}
