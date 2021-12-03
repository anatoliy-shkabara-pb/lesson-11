package s08algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S04_SimpleAlgorithms {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 7, 8, 10, 20, -6, 0, 3, 7));
        System.out.println(list);
        System.out.println("max = " + Collections.max(list));
        System.out.println("min = " + Collections.min(list));
        Collections.swap(list, 0, 4);
        System.out.println("swap at index (0 -> 4) = " + list);
        System.out.println("frequency of 7 = " + Collections.frequency(list, 7));
        Collections.replaceAll(list, 7, -25);
        System.out.println("after replaceAll (7 -> -25) = " + list);
        Collections.reverse(list);
        System.out.println("after reverse = " + list);
        list.removeIf(item -> item == -25);
        System.out.println("remove -25 = " + list);
        list.replaceAll(item -> item * 2);
        System.out.println("multiply 2 = " + list);
        Collections.fill(list, 0);
        System.out.println("fill 0 = " + list);
    }
}
