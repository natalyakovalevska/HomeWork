package home_work_2.loops;

public class Task1_1_1 {

    //используем метод CalculateFactorial(), для произведение всех натуральных чисел от 1 до n
    static int calculateFactorial(int n) {
        int result = 1;
        //исользуем цикл for, чтобы умножить число от 1 до n)
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        //выводим в консоль результат
        System.out.println(calculateFactorial(8));
    }
}
