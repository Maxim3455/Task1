import java.util.Scanner;

public class Num4 {
    public static void main(String[] args){
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scan = new Scanner(System.in);
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scan.nextLine().split(" ");
        // Вызов функции и вывод на экран.
        System.out.print(profitableGamble(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2])));
    }
    // Создание метода, для определения выполняется ли условие.
    public static boolean profitableGamble(double prob, double prize, double pay){
        return prob * prize > pay;
    }
}
