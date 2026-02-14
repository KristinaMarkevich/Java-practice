import java.util.Random;

public class HW4 {


    static void main() {
//        Задача №1
//        Необходимо вывести числа от 0 до 15.
//        1 вариант
          int a = 0;
        while( a <= 15){
            System.out.println(a);
            a++;
        }
//        2 вариант
        for (int i = 0; i < 16; i++){
            System.out.println(i);
        }
//        3 вариант
        int b = 0;
        do {
            System.out.println(b);
            b++;
        }
        while(b < 16);

//        Задача №2
//        Необходимо возводить в степень число 5 начиная с показателя 1,
//            пока результат возведения в степень меньше 10000,
//            вывести результат каждого возведения в степень.
//        1 вариант
        int number = 5;
        for(int step = 1; Math.pow(number, step) < 10000; step++){
            System.out.println(Math.pow(number, step));
        }

//        2 вариант
        int number = 5;
        int pow = 1;
        int result = 0;
        while(result < 10000){
            if( result != 0){
                System.out.println(result);
            }
                result = (int) Math.pow(number, pow);
                pow++;

        }

//                Задача №3
//        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
//                Реализовать 2 варианта:
//        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
//        без использования конструкции if (шаг цикла на ваше усмотрение).
//        1 вариант
          for (int number = 40; number >= 40 && number <= 60; number++){
            if(number%4 == 0){
                System.out.println(number);
            }
        }
//        2 вариант
          for (int number = 40; number >= 40 && number <= 60; number++) {
            String name = (number % 4 == 0) ? String.valueOf(number) + "\n" : "";
            System.out.print(name);
        }
    }

}
