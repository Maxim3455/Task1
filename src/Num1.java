import java.util.Scanner;

public class Num1 {
    public static void main (String[] args){
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner wew = new Scanner(System.in);
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = wew.nextLine().split(" ");
        // Вызов функции и вывод на экран.
        System.out.print(remainder(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
    // Создание метода, для возвращения остатка при делении a на b.
    public static int remainder(int a, int b){
        int res;
        res = a % b;
        return res;
    }
}
