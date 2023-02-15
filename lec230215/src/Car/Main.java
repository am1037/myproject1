package Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        List<Integer> intList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();
        int j = 0;
        double average_1 = 0;
        double average_2 = 1;

        while (Math.abs(average_1 - average_2) >= 0.0001) {
            while (!intList.containsAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))) {
                intList.add(r.nextInt(10));
                j++;
            }
            intList.clear();
            resultList.add(j);
            j = 0;
            average_2 = average_1;
            average_1 = resultList.stream().mapToInt(Integer::intValue).average().getAsDouble();
        }
        System.out.println("Average number of attempts: " + average_1);
    }
}