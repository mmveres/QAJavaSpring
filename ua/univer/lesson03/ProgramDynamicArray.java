package ua.univer.lesson03;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramDynamicArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true) {
            System.out.println("Enter value");
            if (sc.hasNextInt()) {
                if (count>=arr.length){
//                    int [] t = new int[arr.length*2];
//                    for (int i = 0; i < arr.length; i++) {
//                        t[i] = arr[i];
//                    }
//                    arr=t;

                   arr=Arrays.copyOf(arr,arr.length*2);
                }
                arr[count] = sc.nextInt();
                count++;
            } else {
                System.err.println("Not int");
                sc.nextLine();
            }
            System.out.println("enter again[y]");
            String answer = sc.next();
            if (!answer.equals("y")) break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
