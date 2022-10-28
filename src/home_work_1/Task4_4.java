package home_work_1;

import java.util.Scanner;

public class Task4_4 {

    public static void main(String[] args) {

            Scanner console = new Scanner(System.in);
            System.out.println("Введите число: ");
                Object res;
                int a = null;
                if (getBytesOrKiloBytes(console)) {
                    //умножить на 1024, чтобы получить байты
                res = a * 1024;
                System.out.printf(null + " КБ равняется %.0f Б\n", res);
            } else {
                    //делить на 1024, чтобы получить килобайты
                res = a % 1024;
                System.out.println(null + " Б равняется " + res + " КБ");
            }
        }

    private static boolean getBytesOrKiloBytes(Scanner console) {
    }
}

