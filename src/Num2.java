import java.util.Scanner;

public class Num2 {
    public static void main(String[] args){
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scan = new Scanner (System.in);
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scan.nextLine().split(" ");
        // Вызов функции и вывод на экран.
        System.out.print(triArea(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
    // Создание метода, для возвращения площади треугольника.
    public static double triArea(int b, int h){
        double res = 0;
        res = 0.5 * b * h;
        return res;
    }
}
