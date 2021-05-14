package ua.univer;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {
        int n = 1234;
        System.out.format("|%d\t\t|%n", n);
        System.out.format("|%08d\t|%n", n);
        System.out.format("|%+8d\t|%n", n);
        System.out.format("|%,8d\t|%n", n);
        System.out.format("|%+,8d\t|%n", n);

        double pi = Math.PI;
        System.out.format("|Math.PI\t|%n", n);
        System.out.format("|%f\t|%n", pi);
        System.out.format("|%.3f\t\t|%n", pi);
        System.out.format("|%8.3f\t|%n", pi);

        Integer number = n;
        // Бинарный формат числа
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(number);
        System.out.println(convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(number).toUpperCase();
        System.out.println(convert);

    }

    private static void patternOut() {
        Pattern p1 = Pattern.compile("[\\S]+");
        Matcher m1 = p1.matcher("h");
        boolean b = m1.matches();
        System.out.println(b);
    }

    private static void swapingTest() {
        int a = 30;
        int b = 45;
        swapFunction(a, b);
        //Now, Before and After swapping values will be same here
        System.out.println("After swapping, a = " + a + " and b is " + b);
        int[] arr = {a, b};
        swapFunction(arr);
        System.out.println("After swapping," + Arrays.toString(arr));
    }

    public static void swapFunction(int[] arr) {
        System.out.println("Before swapping(Inside)," + Arrays.toString(arr));

        // Swap n1 with n2
        int t = arr[0];
        arr[0] = arr[1];
        arr[1] = t;
        System.out.println("After swapping(Inside)," + Arrays.toString(arr));
    }

    public static void swapFunction(int a, int b) {
        System.out.println("Before swapping(Inside), a = " + a + " b = " + b);

        // Swap n1 with n2
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapping(Inside), a = " + a + " b = " + b);
    }


    private static void test1() {
        int x = 4;
        int y = 0;
        if (x > 0) {
            y = x * x;
        }
        System.out.println(y);
        int z = 123;
        int z1 = z / 10;
        int z2 = z % 10;
        System.out.println(z2);
    }
}
