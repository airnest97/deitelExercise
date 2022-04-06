package task;

public class ArrayTask {
    public static void main(String[] args) {
        int[] threeHundred = new int[300];

        int counter = 0;
        while (counter < threeHundred.length) {
            threeHundred[counter] = counter + 1;
            counter++;
        }
        for (int i = 0; i < counter; i++)
            System.out.print(threeHundred[i] + " ");
    }
}
