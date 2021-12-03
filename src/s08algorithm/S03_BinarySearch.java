package s08algorithm;

import java.util.Arrays;

public class S03_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 6, 7, 2, 0, -1, 30};
        System.out.println("array = " + Arrays.toString(arr));

        // не сработает, так как требует отсортированный массив
        int index = Arrays.binarySearch(arr, 0);
        System.out.println("index of 0 = " + index);
        System.out.println();

        Arrays.sort(arr);
        System.out.println("sorted array = " + Arrays.toString(arr));
        index = Arrays.binarySearch(arr, 0);
        System.out.println("index of 0 = " + index);
    }
}
