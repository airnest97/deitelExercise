package task;


import java.util.Arrays;
import java.util.Collections;

public class DescendingArray {
    public static void main(String[] args) {
        Integer[] array = {13, 56, 1, 45, 100, 2, 8, 5};

        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
