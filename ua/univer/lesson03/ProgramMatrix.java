package ua.univer.lesson03;

import java.util.Arrays;

public class ProgramMatrix {
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{1,2,3,-1},
                {4,5,6},
                {7,8,9,3,4}};
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(matrix[1].length);
        System.out.println(matrix[2].length);
        printMatrix(matrix);
        int [] rowSum = new int[matrix.length];
        int sum = 0; int allSum=0;
        for (int i = 0; i < matrix.length; i++) {
            sum=0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
            }
            System.out.println(sum);
            allSum+=sum;
            rowSum[i]=sum;
        }
        System.out.println(allSum);
        System.out.println(Arrays.toString(rowSum));
        System.out.println(Arrays.deepToString(matrix));

        int[] arr= {3,5,2,23,54,3,4,3,5,54};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
