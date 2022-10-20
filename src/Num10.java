import java.util.Scanner;

public class Num10 {
    public static void main(String[] args){
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scan = new Scanner (System.in);
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scan.nextLine().split(" ");
        // Инициализация целочисленных переменных и определение значений переменных через элементы массива args.
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        // Вызов функции и вывод на экран.
        System.out.println(abcmath(a, b, c));
    }
    // Создание метода, для возвращения true или false, делится ли число a сложенное с самим собой b раз на c.
    public static boolean abcmath(int a, int b, int c){
        int res;
        res = a * b;
        if (res % c == 0){
            return true;
        }
        return false;
    }
}
