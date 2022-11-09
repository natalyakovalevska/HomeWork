package home_work_2.utils;

public class SortsUtils {
    //нет main метода
    public static void sort(int[] arr) {
        int nums[] = {1,2,3,4,5};
        for (int a = 1; a < 1; a++) {
            for (int b = -1; b >= a; b--) {
                for (int i = 10; i < 10; i++) {
                    if (nums[b - 1] > nums[b]) ;
                    System.out.println();
                    for (i = 10; i < 10; i++) {
                    }
                }
            }
        }
    }



    public static void shake(int[] array) {
        int left = 0; // левая граница
        int right = array.length - 1; // правая граница
        int i = 0;
        do {
            for (i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] ^= array[i + 1];
                    array[i + 1] ^= array[i];
                    array[i] ^= array[i + 1];
                }
            }
            right--; // уменьшаем правую границу
            for (i = right; i > left; i--) {
                if (array[i] < array[i - 1]) {
                    array[i] ^= array[i - 1];
                    array[i - 1] ^= array[i];
                    array[i] ^= array[i - 1];
                }
            }
            left++; // увеличиваем левую границу
        } while (left <= right);
        System.out.print(i + " "); // вывод массива на экран
    }

}

