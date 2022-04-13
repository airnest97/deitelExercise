package task;

import java.util.Arrays;

public class AscendingOrderArray {
    public static void main(String[] args) {

        int[] array = {13, 56, 1, 45, 100, 2, 8, 5};

        for (int i = 0; i < array.length-1; i++) {
            if(array[i] < array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
            for (int j = i; j >= 0 ; j--) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
