package home_work_2.sorts;

import java.util.Scanner;
import java.util.Arrays;
import home_work_2.utils.SortsUtils;

public class SortsMain {
    public static void main(String[] args) {
            System.out.println("Массив до сортировки:");
            System.out.println("Массив после сортировки:");

       int numbers [] = new int[0];
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        sortAndPrint(new int[]{1,2,3,4,5,6});
        sortAndPrint(new int[]{1, 1, 1, 1});
        sortAndPrint(new int[]{9,1,5,99,9,9});
        sortAndPrint(new int[]{});
        sortAndPrint(new int[]{6,5,4,3,2,1});

        System.out.println();

    }

    private static void sortAndPrint(int[] ints) {
    }

}
