package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите 1-е число:");
        if(console.hasNextInt()) {
            int z1 = console.nextInt();
            System.out.println(z1);

            System.out.println("Введите 2-е число:");
            if(console.hasNextInt()) {
                int z2 = console.nextInt();
                System.out.println(z2);

                // 100001 (33)
                //  10100 (20)
                //      0
                int and = z1 & z2;
                System.out.println("z1 & z2: " + and);

                // 100001 (33)
                //  10100 (20)
                // 110101 (53)
                int or = z1 | z2;
                System.out.println("z1 | z2: " + or);

                // bad operand types for binary operator '&'
                // first type:  double
                // second type: int
                // int z = 42.5 & z1;
                
            } else {
                System.out.println("Неверный ввод!");
            }
        } else {
            System.out.println("Неверный ввод!");
        }
    }
}
