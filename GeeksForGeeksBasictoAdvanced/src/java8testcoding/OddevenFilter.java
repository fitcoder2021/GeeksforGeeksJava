package java8testcoding;

import java.util.Arrays;
import java.util.List;

public class OddevenFilter {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10,34,56,66,76,33);

        ls.stream().filter(l->l%3==0).forEach(System.out::println);
    }
}
