package ua.univer.lesson05;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ProgramSplit {
    public static void main(String[] args) throws FileNotFoundException {
        String str = "mama mila ramu mama ramu mila mama mama";
        printIndexWord(str, "mama");
        String strTato = str.replaceAll("mama","tato");
        System.out.println(strTato);
        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

       // Math.abs(d1-d2)<eps;


        int[] arrValues = new int[10];
        Scanner sc = new Scanner(new FileInputStream("c:\\in\\java1\\value.txt"));
        StringBuilder strValues = new StringBuilder();
        while(sc.hasNextLine()){
            System.out.println( strValues.capacity()+"/"+strValues.length());
            strValues.append(sc.nextLine());
        }

        String [] valueStr = strValues.toString().split(" ");
        for (int i = 0; i < valueStr.length; i++) {
            if (i >= arrValues.length)
                arrValues= Arrays.copyOf(arrValues,arrValues.length*2);
            arrValues[i] = Integer.parseInt(valueStr[i]);
            System.out.println(Arrays.toString(arrValues));
        }
        arrValues= Arrays.copyOf(arrValues,valueStr.length);
   //     System.out.println(Arrays.toString(arrValues));
   //     System.out.println(strValues);
    }

    private static void printIndexWord(String str, String word) {
        int index = str.indexOf(word);
        System.out.println(index);
        int indexLast = str.lastIndexOf(word);
        while (index < indexLast) {
            index = str.indexOf(word, index + 1);
            System.out.println(index);
        }
    }
}
