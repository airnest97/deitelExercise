package task;


import java.util.Arrays;

public class AscendingArray {
    public static void main(String[] args) {

        int[] array = {13, 56, 1, 45, 100, 2, 8, 5};

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
