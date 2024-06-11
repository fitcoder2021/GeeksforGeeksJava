package javahungry;

import java.util.Arrays;
import java.util.List;

public class FirstElement {
    public static void main(String[] args) {

        List<Integer> ls = Arrays.asList(10,20,30,40);

        ls.stream().
               skip(1).findFirst().ifPresent(System.out::println);


        }

}
