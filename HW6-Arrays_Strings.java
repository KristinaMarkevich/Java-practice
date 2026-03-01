  static void main() {
//        Задача №4
//        Дана строка:
//        String s = “Перестановочный алгоритм быстрого действия”;
//        необходимо вывести все буквы “о” из этой строки.
//                Для указанной строки ответ будет “ооооо” (или в столбик)

        String s = "Перестановочный алгоритм быстрого действия";
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'о'){
                System.out.print("o");
            }
        }

        System.out.println(" ");
//        Задача №5
//        Дана строка:
//        String s = “Перевыборы выбранного президента”;
//        необходимо подсчитать количество букв “е” в строке.
//        Для указанной строки ответ будет 4.

        String st = "Перевыборы выбранного президента";
        int count = 0;
        for(int i = 0; i < st.length(); i++){
            if(st.charAt(i) == 'е'){
                count += 1;
            }
        }
        System.out.println(count);

//        Задача №6
//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести сумму всех значений массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);

//        Задача №7
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести сумму элементов массива.

        int[][] array1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum1 = 0;

        for(int i = 0; i < array1.length; i++){
            int[] part = array1[i];
            for(int j = 0; j < part.length; j++){
                sum1 += part[j];
            }
        }
        System.out.println(sum1);

//                Задача №8
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести максимальное значение массива.

        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array2.length; i++){
            int[] len = array2[i];
            for(int j = 0; j < len.length; j++){
                if(len[j] > max){
                    max = len[j];
                }
            }
        }
        System.out.println(max);

//                Задача №9
//
//        Дан массив:
//        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//        необходимо вывести количество элементов в массиве.

        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count1 = 0;

        for(int i = 0; i < array3.length; i++){
            int [] part = array3[i];
            for(int j = 0; j < part.length; j++){
                count1 += 1;
            }
        }
        System.out.println(count1);
