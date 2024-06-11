package java8;

import java.util.Arrays;
import java.util.List;

public class Course {
    public static void main(String[] args) {

        List<String> ls = Arrays.asList("physics", "Dsa", "Java", "Microservices");

        ls.stream().map(s->s+ ",").forEach(System.out::println);
    }
}
