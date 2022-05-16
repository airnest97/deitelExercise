package chapter7;

import java.util.Scanner;

public class PixelQuantization {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] pixelColour = new int[10];

        for (int i = 0; i < pixelColour.length; i++) {
            System.out.println("Enter pixel value "+(i+1)+": ");
            int pixelValue = input.nextInt();
            if (pixelValue >= 0 && pixelValue <= 20){
            pixelColour[i] = 10;}
            else if (pixelValue >= 21 && pixelValue <= 40){
                pixelColour[i] = 30;}
            else if (pixelValue >= 41 && pixelValue <= 60){
                pixelColour[i] = 50;}
            else if (pixelValue >= 61 && pixelValue <= 80){
                pixelColour[i] = 70;}
            else if (pixelValue >= 81 && pixelValue <= 100){
                pixelColour[i] = 90;}
            else if (pixelValue >= 101 && pixelValue <= 120){
                pixelColour[i] = 110;}
            else if (pixelValue >= 121 && pixelValue <= 140){
                pixelColour[i] = 130;}
            else if (pixelValue >= 141 && pixelValue <= 160){
                pixelColour[i] = 150;}
            else if (pixelValue >= 161 && pixelValue <= 180){
                pixelColour[i] = 170;}
            else {pixelColour[i] = 190;}

        }
        System.out.println("Quantized values");
        for(int pixelValue:pixelColour){
            System.out.println("     "+pixelValue);
        }

    }
}