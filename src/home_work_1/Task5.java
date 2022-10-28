package home_work_1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean weekday = console.hasNextBoolean();
        boolean vacation =console.hasNextBoolean();

        if (sleepIn(weekday, vacation))
            System.out.println("Можем спать дальше");
        else
            System.out.println("Пора идти на работу");
    }

    private static boolean sleepIn(boolean weekday, boolean vacation) {
        return true;
    }
}