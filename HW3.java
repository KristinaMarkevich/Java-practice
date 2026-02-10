public class HW3 {

    static void main(String[] args) {
        /*Задача №1
        Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        a == b - если переменные равны
        a < b - если переменная a меньше b
        a > b - если переменная b меньше a */

        int a = 1, b = 1;

        if (a == b) {
            System.out.println("a is equal b");
        } else if (a < b) {
            System.out.println("a is less than b");
        } else {
            System.out.println("a is greater than b");
        }

       /*Задача №2
        Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        maybe a and b are even - если сумма переменных четная
        some variable is odd - если сумма переменных нечетная*/

        int a1 = 2, b1 = 4;
        int sum = a1 + b1;

        if (sum % 2 == 0){
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        if ((a1 + b1) % 2 == 0){
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }


       /* Задача №3
        Необходимо создать целочисленную переменную,
        присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
        больше 10 - если переменная больше 10
        меньше 100 - если переменная меньше 100
        результат деления на 2 больше 20 - если это соответствует истине
        значение переменной между 5 и 40 включительно - если это правда
        значение переменной меньше 5 или больше 40 - если предыдущие условие ложное*/
      
        int c = 41;

        if (c > 10){
            System.out.println("greater than 10 ");
        }

        if (c < 100) {
            System.out.println("less than 100");
        }

        if(c / 2.0 > 20) {
            System.out.println("the result of division by 2 is greater than 20");
        }

        if(c >= 5 && c <= 40){
            System.out.println("between 5 and 40");
        } else {
            System.out.println("out 5 and 40");
        }

    }
}

