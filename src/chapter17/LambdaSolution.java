package chapter17;

import java.security.SecureRandom;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class LambdaSolution {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        IntStream stream = secureRandom.ints(10, 0, 1001);
        List<Integer> list = stream.boxed().toList();

        long evenCount = list.stream().filter(x -> x % 2 == 0)
                .count();

        long oddCount = list.stream().filter(x -> x % 2 != 0)
                .count();

        double evenAverage = (list.stream()
                                .filter(x -> x % 2 == 0)
                                .reduce(0, Integer::sum) * 1.0) / evenCount;

        double oddAverage = (list.stream().filter(x -> x % 2 != 0).reduce(0, Integer::sum) * 1.0) /oddCount;

        double average = (list.stream().reduce(0, Integer::sum)) * 1.0 / list.size();

        IntPredicate positiveNumbers = x -> x >= 0;
        IntPredicate greaterThan5 = x -> Math.abs(x) > 5;
        int[] values = {1, -2, 4, 5, 6, 12, -23, 5};
        List<Integer> list1 = IntStream.of(values).filter(greaterThan5.negate()).boxed().toList();
        List<Integer> list2 = IntStream.of(values).filter(greaterThan5.and(positiveNumbers)).boxed().toList();
        System.out.println(list1);
        System.out.println(list2);



        System.out.println(list);
        System.out.println(evenCount);
        System.out.println(oddCount);
        System.out.println(evenAverage);
        System.out.println(oddAverage);
        System.out.println(average);
    }
}
