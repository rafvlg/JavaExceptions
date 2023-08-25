package Seminar1;

import java.util.Arrays;

public class HomeWork3 {
        public int[] divArrays(int[] a, int[] b){
      if (a.length != b.length) {
            return new int[]{0}; // Возвращаем нулевой массив длины 1
        }

        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) {
                throw new RuntimeException("Деление на ноль"); // Генерируем исключение при делении на ноль
            }
            c[i] = a[i] / b[i]; // Вычисляем частное элементов массивов
        }

        return c;


    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
      int[] a = {};
      int[] b = {};

      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        a = new int[]{12, 8, 16};
        b = new int[]{4, 2, 4};
      }
      else{
        a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
      }

      Answer ans = new Answer();
      String itresume_res = Arrays.toString(ans.divArrays(a, b));
      System.out.println(itresume_res);
    }
}
