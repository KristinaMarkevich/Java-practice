public class mainHW2 {
    static void main() {
   /* Задача №1
    Необходимо создать целочисленные переменные a и b,
    присвоить произвольные значения переменным на ваш выбор
    и вывести результаты следующих операций с этими переменными:
    сложение, умножение, вычитание, деление и остаток от деления.
    Также сделать проверку на четность этих переменных и вывести результат.*/

    int a = 5, b = 4;
        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Деление: " + (a / b));
        System.out.println("Деление дробных чисел: " + (a *1.0)/b);

        System.out.print("Остаток от деления: ");
        System.out.println(a % b);

        System.out.println("Проверка на четность переменной а: " + a % 2); // 1 - нечетное
        System.out.println("Проверка на четность переменной b: " + b % 2); // 0 - четное

    /* Задача №2
    Необходимо создать целочисленные переменные a и b,
    присвоить им произвольные значения, а потом поменять значения
    местами(значение переменной a должно оказаться в переменной b и наоборот).*/
        int a1 = 3, b1 = 7;
        int temp = a1;
        a1 = b1;
        b1 = temp;
        System.out.println(a1);
        System.out.println(b1);

   /* Задача №3
    Создать программу дележа добычи на пиратском корабле.
    По обычаю, половина добычи идет владельцу корабля, половина оставшегося — капитану,
    остальное делится поровну между всеми членами команды, включая капитана.
    Размер добычи (например, в дублонах) и количество пиратов на корабле
    задать переменными.
    Вывести на экран кому сколько дублонов полагается
    Сколько получит капитан (Джек Воробей, естественно), если он утверждает,
    что корабль принадлежит ему?*/
      
        int team = 5;
        int tres = 1000;

        int owner_part = tres / 2;
        int captain_part = owner_part / 2;
        int other_sum = tres - owner_part - captain_part;
        int other_part = other_sum / team;
        int sum_other_part = (5 * other_part) - other_part;
        captain_part = captain_part + other_part;

        System.out.println("Доля владельца коробля: " + owner_part);
        System.out.println("Доля капитана: " + captain_part);
        System.out.println("Доля 1-го члена команды: " + other_part );
        System.out.println("Доля команды: " + sum_other_part );
        System.out.println("Доля Джека Воробья: " + (owner_part + captain_part));
    }

}
