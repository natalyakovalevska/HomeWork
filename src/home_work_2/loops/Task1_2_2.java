package home_work_2.loops;

import java.util.Scanner;

public class Task1_2_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое число: ");

        int x = sc.nextInt();
        if (x % 1 == 0) {
            System.out.println("Введено целое число!");
        } else {
            System.out.println("Введено не целое число!");
        }


    }

}