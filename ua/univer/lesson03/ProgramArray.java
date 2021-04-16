package ua.univer.lesson03;

import java.util.Scanner;

public class ProgramArray {
    public static int sumElemArr(int[] arr) {
        int sum = 0;
        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
    }
    public static void printReverseArr(int[] arr) {
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println("arr[" + i + "]=" + arr[i]);
        }
    }
    public static void main(String[] args) {
        int a = 1;
        int[] arr = new int[10];
        System.out.println(arr);
        fillFromConsole(arr);
//        int sumResult = sumElemArr(arr);
//        System.out.println(sumResult);
        printArr(arr);

    }

    public static void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * i;
        }
    }
    public static int getMark(int n){
        if (n>3 && n<12){
            return n;
        }
        else{
            throw new IllegalArgumentException("Not Mark");
        }

    }
    public static void fillFromConsole(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr["+i+"]=");
            int mark = validateMark(sc);
            arr[i] = mark;
        }
        sc.close();
    }

    private static int validateMark(Scanner sc) {
        while(true){
        try{
         int valueInt = validateInt(sc);
         return getMark(valueInt);
        }catch (IllegalArgumentException e){
            System.err.println("Not Mark");
        }
        }
    }

    private static int validateInt(Scanner sc) {
        while (true) {
            try {
                System.out.println("Enter value=");
                return sc.nextInt();
            } catch (Exception e) {
                System.err.println("Error input not int");
                sc.nextLine();
            }

        }
    }
}
