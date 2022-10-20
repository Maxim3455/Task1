import java.util.Scanner;

public class Num6 {
    public static void main(String[] args){
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scan = new Scanner (System.in);
        // Инициализация символьной переменной и ввод символа пользователем.
        char f = scan.next().charAt(0);
        // Вызов функции и вывод на экран.
        System.out.println(ctoa((f)));
    }
    // Создание метода, для возвращения кода ASCII элемента.
    public static int ctoa(char a)
    {
        return ((int) a);
    }
}
