package s08algorithm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class S02_Shuffle {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("list = " + list);
        Collections.shuffle(list);
        System.out.println("shuffled list = " + list);
    }
}
