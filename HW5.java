public class HW5 {

    static void main() {
      
//    Задача №1
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести все нечетные числа из массива.
      
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for(int i = 0; i < array.length; i++){
            if(array[i]%2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println("END");

//            Задача №2
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести все значения массива больше 5.
      
        int[] array1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for(int i = 0; i < array.length; i++){
            if (array[i] > 5) {
                System.out.print(array1[i] + " ");
            }
        }
        System.out.println("END");

        for(int i = 0; i < array.length; i++){
            String result = (array1[i] > 5)? String.valueOf(array1[i]) + " " : "";
            System.out.print(result);
        }
        System.out.println("END");
      
//    Задача №3
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо увеличить все значения массива на 15.

        int[] array2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        for(int i = 0; i < array2.length; i++){
            int sum = array2[i] + 15;
          System.out.print(sum + " ");
        }
        System.out.println("END");

        for(int i = 0; i < array2.length; i++){
            array[i] = array2[i] + 15;
            System.out.print(array[i] + " ");
        }
        System.out.println("END");


    }

}
