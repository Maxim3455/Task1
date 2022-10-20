import java.util.Scanner;

public class Num3 {
    public static void main(String[] args){
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scan = new Scanner (System.in);
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scan.nextLine().split(" ");
        // Вызов функции и вывод на экран.
        System.out.print(animals(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2])));
    }
    // Создание метода, для возвращения общего количества ног всех животных.
    public static int animals(int chickens, int cows, int pigs){
        int res;
        res = 2 * chickens + 4 * cows + 4 * pigs;
        return res;
    }
}
