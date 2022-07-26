package chapter17;

import java.security.SecureRandom;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        IntStream originalStream = IntStream.rangeClosed(1, 20);
        int sum = originalStream.filter(x -> x%2==0).sum();
        System.out.println(sum);


        int sum1 = IntStream. rangeClosed(1, 10).map(x -> x*2).sum();
        System.out.println(sum1);


        int product = IntStream.rangeClosed(1, 5)
                .reduce(5, (accumulator, element) -> accumulator * element);
        System.out.println(product);


        System.out.println(triple());


        SecureRandom secureRandom = getSecureRandom();


        lambdaFunction(secureRandom);


        sentenceOrder();
    }

    private static void lambdaFunction(SecureRandom secureRandom) {
        String input = secureRandom.ints(20, 1, 14)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(input);
    }

    private static SecureRandom getSecureRandom() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.ints(10, 1, 7)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
        return secureRandom;
    }

    private static void sentenceOrder() {
        String sentence = new Scanner(System.in).nextLine().toLowerCase();
        String [] element = sentence.split(" ");

        List<String> stringList = Stream.of(element).sorted()
                .distinct().collect(Collectors.toList());

        System.out.println(stringList);
    }

    public static int triple(){
        IntStream stream = IntStream.rangeClosed(1, 20);
        return stream.filter(x -> x%2!=0).map(x -> x*x*x).sum();
    }
}
