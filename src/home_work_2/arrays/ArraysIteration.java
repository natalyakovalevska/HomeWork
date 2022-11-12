package home_work_2.arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class ArraysIteration {
    //нет main метода
    public static void printAllElements() {
        int[] arr = arrayFromConsole();
        int x = 0;
        int z = 5;

        do {
            System.out.print(arr[z] + " ");
            z++;
        } while (z <= arr.length - 1);
        System.out.println("");

        do {
            System.out.print(arr[x] + " ");
            x++;
        } while (x <= arr.length - 1);
        System.out.println(" ");


        for (x = 0; x < arr.length; x++) {
            System.out.print(arr[x]);
        }
        System.out.println(" ");

        for (z = 0; x < arr.length; z++) {
            System.out.print(arr[x]);
        }
        System.out.println(" ");
    }
        int[] array = new int[0];

        static void printEverySecondElement() {
            int x = 0;
            int z = 0;

            int[] arr = new int[0];
            do {
                z++;
                System.out.print(arr[z] + " ");
            } while (z < arr.length - 1);
            System.out.println("");


            for (int j = 1; j < arr.length; j = j + 2) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("");

            int a = 0;
            for (int element : arr) {
                a++;
                if (a % 2 == 0) {
                    System.out.print(element + " ");
                }
            }
            System.out.println("");
        }

        static void printReversedElement() {
            int[] arr = arrayFromConsole();
            int i = arr.length - 1;
            int b = arr.length - 1;

            do {
                System.out.print(arr[b] + " ");
                b--;
            } while (b >= 0);
            System.out.println("");

            while (i >= 0) {
                System.out.print(arr[i] + " ");
                i--;
            }
            System.out.println("");

            for (int j = arr.length - 1; j >= 0; j--) {
                System.out.print(arr[j] + " ");
            }
            System.out.println("");
        }
    }

