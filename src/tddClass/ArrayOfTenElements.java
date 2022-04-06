package tddClass;

public class ArrayOfTenElements {

    int maximumNumber = Integer.MIN_VALUE;
    int minimumNumber = Integer.MAX_VALUE;
    int sum = 0;
    double average = 0;

    public int findMaximumFrom(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] > maximumNumber)
                maximumNumber = scores[i];
        }
        return maximumNumber;
    }

    public int findMinimumFrom(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            if(minimumNumber > scores[i])
                minimumNumber = scores[i];
        }
        return minimumNumber;
    }

    public double findAverageFrom(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
            average = (double)sum / scores.length;
        }
        return average;
    }

    public int findSumFrom(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        return sum;
    }
}
