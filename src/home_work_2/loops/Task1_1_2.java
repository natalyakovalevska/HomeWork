package home_work_2.loops;

public class Task1_1_2 {

    public static void main(String[] args) {
        System.out.println(factorial(8));
    }

    private static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}
