package ua.univer.lesson05;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String str;
        int [] masInt = {1,4, 'a'};
        char [] masChar = {50,54, 'a'};

        System.out.println(masInt);
        for (int i = 0; i < masInt.length; i++) {
            System.out.println(masInt[i]);
            System.out.println((char)masInt[i]);
        }
        System.out.println(masChar);

        masInt = getMasInt();


        int sum = getSum(masInt);

        System.out.println(sum);
    }


    private static int[] getMasInt() {
        int[] masInt;
        Scanner sc = new Scanner(System.in);
        masInt = new int[3];
        for (int i = 0; i < masInt.length; i++) {
            System.out.println("Enter value");
            String value = sc.next();
            masInt[i] = value.charAt(0);
        }
        return masInt;
    }

    private static int getSum(int[] masInt) {
        int sum = 0;
        for (int i = 0; i < masInt.length; i++) {
            sum+= masInt[i];
        }
        return sum;
    }
}
