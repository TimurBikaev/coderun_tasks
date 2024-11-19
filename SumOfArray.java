public class Main {
    public static void main(String[] args) {
        /**
         * ЗАДАЧА - на вход принять массив чисел от 1 до 100 и посчитать сумму его элементов
         */

        int[] array = {1, 2, 3, 4, -1, 101, 5};

//        int array1[] = new int[] {1, 2, 3, 4}; // Полная форма, можно использовать в любом месте
//        int[] array2 = {1, 2, 3, 4};           // Краткая форма, удобна для объявления и инициализации

        if(sumOfArray(array) == 15){
            System.out.println("Метод работает верно");
        }
        else System.out.println("Ошибка");
    }

    private static int sumOfArray(int[] array) {


        int size = array.length;
        System.out.println();
        System.out.println("Размер массива " + size);

        int sum = 0;
        for (int i = 0; i < size; i++) {

            if(array[i]<1 || array[i]>100){
                System.out.println("Элемент массива " + array[i] + " не в диапазоне и не учтен в сумме");
                continue; //вместо break использую продолжение
            }
            else {
                 sum += array[i];
            }
        }

        System.out.println("Сумма элементов массива " + sum);
        return sum;

    }
}
