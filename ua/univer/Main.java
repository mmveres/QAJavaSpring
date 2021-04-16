package ua.univer;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
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
