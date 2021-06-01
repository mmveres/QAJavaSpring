package ua.univer.lesson15;

import java.util.function.*;
import java.util.*;

//@FunctionalInterface
//interface MyOp{
//    int oper(int x, int y);
//}

public class Program {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

      //  System.out.println(sum(x, y));

        BiFunction<Integer, Integer, Integer> sum = (a, b)->{ return a+b; };

        BiFunction<Integer, Integer, Integer> multy = (x1,  y1) -> x1*y1;

        Function<List<Integer>, Integer> countOdd = (list) ->{
            int count = 0;
            for (Integer elem: list) {
                if (elem % 2== 1) count++;
            }
            return count;
        };


        System.out.println(sum.apply(3,4));
        System.out.println(multy.apply(2,4));
        System.out.println("count = "+countOdd.apply(Arrays.asList(1,2,3,4,5)));
        System.out.println("count = "+countOdd.apply(Arrays.asList(11,21,13,4,5)));
        System.out.println("count = "+countOdd.apply(Arrays.asList(1,2,3,41,5)));
    }
}
