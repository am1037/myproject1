package TreeGame4;

import java.util.ArrayList;
import java.util.List;

public class Main_3 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

// Add some elements to list1
        list1.add(1);
        list1.add(2);
        list1.add(3);

// Move the first element from list1 to list2
        int element = list1.remove(0);
        list2.add(element);

// Print the contents of list1 and list2
        System.out.println("list1: " + list1); // Output: list1: [2, 3]
        System.out.println("list2: " + list2); // Output: list2: [1]
    }
}
