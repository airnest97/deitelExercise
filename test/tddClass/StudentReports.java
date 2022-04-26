package tddClass;


import java.util.Arrays;
import java.util.Collections;

public class StudentReports {
    int [][] grades;
    public StudentReports(int[][] grades) {
        this.grades = grades;
    }

    public int getSumPerStudent(int indexNumber) {
        int sum = 0;
        for (int j = 0; j < grades[indexNumber].length; j++) {
                sum += grades[indexNumber][j];
            }
        return sum;
    }

    public double getAverageForStudent(int indexNumber) {
        return (double) getSumPerStudent(indexNumber) / grades[indexNumber].length;
    }

    public int getStudentPosition(int indexNumber) {

        Integer[] positionArray = new Integer[grades.length];

        for (int i = 0; i < grades.length; i++) {
            positionArray[i] = getSumPerStudent(i);
        }

//        for (int i = 0; i < positionArray.length-1; i++) {
//            if (positionArray[i] > positionArray[i+1]){
//                int temp = positionArray[i];
//                positionArray[i] = positionArray[i+1];
//                positionArray[i+1] = temp;
//            }
//            for (int j = i; j >= 0; j--) {
//                if (positionArray[j] < positionArray[j+1]){
//                    int temp = positionArray[j];
//                    positionArray[j] = positionArray[j+1];
//                    positionArray[j+1] = temp;
//                }
//            }
//        }
        Arrays.parallelSort(positionArray, Collections.reverseOrder());

        int sum = getSumPerStudent(indexNumber);

        return Arrays.asList(positionArray).indexOf(sum) + 1;
    }

}
