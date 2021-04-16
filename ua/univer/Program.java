package ua.univer;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and power n");
        int x = sc.nextInt();
        int n = sc.nextInt();
        int xInPower = power(x, n);
        System.out.println("x = "+x+" in power "+n+" = "+xInPower);
        System.out.println(Math.pow(x,n));
    }

    private static void testOper() {
        MyLib.task1();
        double f1 = 10000.00100;
        double f2 = 10000.00200;
        boolean isF1EqualsF2 = MyLib.task2(f1, f2);
        System.out.println(isF1EqualsF2);

        int x1 = MyLib.getAnInt();

        MyLib.logicOper(x1);

        MyLib.binOper();
    }

    private static int power(int x, int n) {
        int xInPower = 1;
        for (int i = 0; i < n; i++) {
            xInPower *= x;
        }
        return xInPower;
    }


}
