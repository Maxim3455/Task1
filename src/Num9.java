import java.util.Scanner;

public class Num9 {
    public static void main(String[] args) {
        // Создание объекта класса Scanner для ввода пользователем данных
        Scanner scan = new Scanner(System.in);
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scan.nextLine().split(" ");
        // Задание массива с целочисленными местами длинной массива args.
        int[] a = new int[args.length];
        // Цикл для заполенения нового массива целыми числами.
        for (int i = 0; i < args.length; i++){
            a[i] = Integer.parseInt(args[i]);
        }
        // Вызов функции и вывод на экран.
        System.out.println(sumOfCubes(a));
    }
    // Создание метода, для возвращения суммы кубов заданных в массиве чисел.
    public static int sumOfCubes(int arr[]) {
        int res = 0;
        for (int i = 0; i < arr.length; i++){
            res += Math.pow(arr[i], 3);
        }
        return res;
    }
}
