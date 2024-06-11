package loopscode;

public class ForEachTest {
    public static void main(String[] args) {

        int[] marks = {125, 132, 96, 34, 12};

        int highesetMarks = maximium(marks);
        System.out.println("highest marks " + highesetMarks);
    }

    private static int maximium(int[] numbers) {

        int maxSoFar = numbers[0];

        for (int num : numbers) {

            if (num > maxSoFar) {
                maxSoFar = num;
            }
        }
        return maxSoFar;


    }}





