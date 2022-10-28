package home_work_1;

import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год");

        int a = getInt(console);
                //год, номер которого кратен 400, — високосный
        if (a % 400 == 0) {
                System.out.println ("Високосный");
            } else if (a % 100 == 0) {
                System.out.println ("Год не високосный");
            //год, номер которого кратен 4, — високосный
            } else if (a % 4 == 0) {
                System.out.println ("Год високосный");
            }

    }

    private static int getInt(Scanner console) {
        return 0;
    }

}


