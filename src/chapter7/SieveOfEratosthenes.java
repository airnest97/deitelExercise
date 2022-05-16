package chapter7;

import java.util.Arrays;

public class SieveOfEratosthenes {
    private static final  boolean[] SieveOfEratosthenesArray = new boolean[1000];
    public static void main(String[] args) {

        Arrays.fill(SieveOfEratosthenesArray, true);
        determineIfPrimeNumber();
        printPrimeNumbers();
    }


        public static void determineIfPrimeNumber(){
            for (int i = 2; i < 1000; i++) {
                if (SieveOfEratosthenesArray[i]) {
                    for (int j = i + 1; j < 1000; j++) {
                        if (j % i == 0) {
                            SieveOfEratosthenesArray[j] = false;
                        }
                    }

                }
            }
        }
        public static void printPrimeNumbers(){
            for (int i = 2; i < 1000; i++) {
            if (SieveOfEratosthenesArray[i]){
                System.out.println(i);}
            }
        }
    }
