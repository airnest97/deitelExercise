package assignment;


public class ArraySet {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 9};
        int[] arr1 = {2, 4, 1, 9, 3};
        int[] array = {12, 13, 6, 10};
        int[] array1 = {13, 10, 16, 15};
        int[] myArray = new int[10];

        sumOfDistinctFigure(arr, arr1);
        sumOfOverlappingElement(array, array1, myArray);
    }

    private static void sumOfOverlappingElement(int[] array, int[] array1, int[] myArray) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int k : array1) {
                if (array[i] == k) {
                    myArray[i] = array[i] + k;
                }
            }
        }
        sumOfOverlappingElement(myArray, sum);
    }

    private static void sumOfOverlappingElement(int[] myArray, int sum) {
        for (int j : myArray) {
            sum += j;
        }
        System.out.println(sum);
    }

    private static void sumOfDistinctFigure(int[] array, int[] array1) {
        int sum = 0;
        sum = distinctSum(array1, array, sum);
        sum = distinctSum(array, array1, sum);

        System.out.println(sum);
    }

    private static int distinctSum(int[] array, int[] array1, int sum) {
        for (int i = 0; i < array1.length; i++) {
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array1[i] != array[j]){
                    counter++;
                }
            }
            if (counter == array.length){
                sum = sum + array1[i];
            }
        }
        return sum;
    }
}
