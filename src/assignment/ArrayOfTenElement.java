package assignment;

public class ArrayOfTenElement {

    public static void main(String[] args) {

        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int smallest = Integer.MAX_VALUE;

        int[] number = {49,25,66,97,88,41,33,77,56,66};

        findingLargestSumAverageAndSmallestNumberInAnArray(largest, sum, smallest, number);
    }

    private static void findingLargestSumAverageAndSmallestNumberInAnArray(int largest, int sum, int smallest, int[] number) {
        double average;
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] +" ");
            if(number[i]  > largest)
                largest = number[i];
            sum = sum + number[i];
            if(smallest > number[i])
                smallest = number[i];
        }
        average = (double) sum / number.length;
        System.out.println();
        System.out.println("The largest number is: " + largest);
        System.out.println("The sum of the numbers in the array is: " + sum);
        System.out.println("The average of the numbers in the array is: " + average);
        System.out.println("The smallest number is: " + smallest);
    }
}
