package ua.univer;

public class MyLib {
    public static void task1(){
        boolean isEmpty = false;
        // System.out.println(!isEmpty);
        int xBin = 0b1000;
        int xOct = 010;
        int y = 10;
        long x = y;
        y = (int)x;
    }
    public static boolean task2(double f1, double f2){
        boolean isEqual = Math.abs(f1-f2)<0.01;
        return isEqual;
    }
    public static void binOper() {
        int valueBin = 5|6;
        System.out.println(valueBin);
        int valueBin1 = 5&6;
        System.out.println(valueBin1);
        int valueBin2 = 4&1;
        System.out.println(valueBin2);
        int valueBin3 = 4>>1;
        System.out.println(valueBin3);
        int valueBin4 = 4<<1;
        System.out.println(valueBin4);
    }

    public static void logicOper(int x1) {
        boolean b = x1 <5 && x1 >0;
        System.out.println(b);
        boolean b1 = x1 <5 || x1 >3;
        System.out.println(b);
    }

    public static int getAnInt() {
        int x1 = 1;
        int x2 = 2;
        double result = 1.0*x1/x2;
        System.out.println(result);
        return x1;
    }
}
