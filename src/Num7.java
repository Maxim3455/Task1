import java.util.Scanner;

public class Num7 {
    public static void main(String[] args) {
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner d = new Scanner(System.in);
        // Инициализация целочисленной переменной и ввод символа пользователем.
        int S = d.nextInt();
        // Вызов функции и вывод на экран.
        System.out.print(addUpTo(S));
    }
    // Создание метода, для возвращения суммы 1 + 2 + ... + N.
    public static int addUpTo(int N){
        int res;
        res = N*(N+1)/2;
        return res;
    }
}