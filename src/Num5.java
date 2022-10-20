import java.util.Scanner;

public class Num5 {
    public static void main(String[] args){
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner w = new Scanner(System.in);
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = w.nextLine().split(" ");
        // Вызов функции и вывод на экран.
        System.out.print(operation(Integer.parseInt(args[0]),Integer.parseInt(args[1]), Integer.parseInt(args[2])));

    }
    // Создание метода, который возвращает, что нужно сделать с
    // a и b: они должны быть сложены, вычитаны, умножены или разделены, чтобы получить N.
    public static String operation(int N, int a, int b) {

        if (a + b == N) {
            return "add";
        }
        if (a - b == N) {
            return "subtracted";
        }
        if (a * b == N) {
            return "multiply";
        }
        if (a / b == N) {
            return "share";
        }
        return "none";
    }
}

