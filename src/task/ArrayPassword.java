package task;

import java.util.Random;

public class ArrayPassword {
    public static void main(String[] args) {
        Random genPassword = new Random();

        char[] password = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H','I', 'J', 'K', 'L', 'M', '1', '2', '0', '3', '4', '5', '6', '7', '8', '9',
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
        'v', 'w', 'y', 'z'};

        for(int counter =1; counter < 13; counter++){
                    String myPassword = String.valueOf(password[genPassword.nextInt(counter + ' ')]);
                    System.out.print(myPassword);
                }
    }
}
