package home_work_1;

import java.util.Arrays;

public class Task4_2 {

    public static int getMedium(int a, int b, int c) {
        // Создаём массив из трёх элементов
        int[] numbers = {a, b, c};
        // Сортируем его по возрастанию
        Arrays.sort(numbers);
        // Средний элемент окажется вторым по порядку в массиве
        return numbers[1];


        }
    }