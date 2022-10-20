import java.util.Scanner;

public class Num8 {
    public static void main(String [] args){
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner w = new Scanner(System.in);
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = w.nextLine().split(" ");
        // Вызов функции и вывод на экран.
        System.out.print(nextEdge(Integer.parseInt(args[0]), Integer.parseInt(args[1])));

    }
    // Создание метода, для возвращения максимального значения третьего ребра треугольника.
    public static int nextEdge(int a, int b){
        int c;
        c = a + b - 1;
        return c;
    }
}
