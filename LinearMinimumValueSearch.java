public class LinearMinimumValueSearch {

    /*
    Поиск минимального значения в массиве перебором (Линейный поиск)
    Временная сложность: O(n), где n - количество элементов в массиве. Алгоритм проходит массив один раз, сравнивая каждый элемент.
    Этот метод эффективен для небольших массивов или в ситуациях, где требуется однократный поиск минимума

    Дан массив целых чисел. Найти мин. значение и его позицию в массиве
     */

    public static void main(String[] args) {

        int[] array = new int[]{64, 42, 73, 41, 31, 53, 16, 57, 48, 55, 98, 2};

        //Переменная для записи миним.элемента
        int minIndex = 0; //индекс первого элемента массива
        int minValue = array[minIndex]; //инициализируем его первым элементом массива, чтобы затем его сравнивать со всеми

        // Измеряем время выполнения
        long startTime = System.nanoTime();

        //цикл перебора
        //начиная со следующего значения после 0
        for (int i = minIndex + 1; i <array.length; i++ ) {
            //если новое значение меньше текущего минимума - перезаписываем его в минимум
            if (array[i] < minValue) {
                minIndex = i;
                minValue = array[i];
            }
        }

        // Время выполнения
        long endTime = System.nanoTime();
        long durationMillis = endTime - startTime;

        System.out.println("Минимальное значение: " + minValue);
        System.out.println("Расположение в массиве: " + minIndex);
        System.out.println("Время выполнения (наносекунды): " + durationMillis);
    }
}
