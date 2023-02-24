package CrawlingExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class ArraysSortExample {
    public static void main(String[] args) {
        ArrayList<Integer>[] array = new ArrayList[3];
        array[0] = new ArrayList<>(Arrays.asList(5, 3, 2));
        array[1] = new ArrayList<>(Arrays.asList(1, 4, 6));
        array[2] = new ArrayList<>(Arrays.asList(9, 7, 8));

        // Sort the ArrayLists in the array by their first element
        Arrays.sort(array, Comparator.comparingInt(new ToIntFunction<ArrayList<Integer>>() {
            @Override
            public int applyAsInt(ArrayList<Integer> value) {
                return value.get(0);
            }
        }));

        // Print the sorted array
        for (ArrayList<Integer> row : array) {
            System.out.println(row);
        }
    }
}