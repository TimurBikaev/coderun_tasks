import java.util.Arrays;

/* Cортировка пузырьком -- расставить значения в массиве от меньшего к большему
Основная идея - сравнивать элементы попарно: 1 и 2, 2 и 3, 3 и 4...
Если левый элемент больше правого -- меняем их местами
Если перестановок не произошло -- значит все элементы уже расположены в нужном порядке
Каждая итерация переносит самый большой элемент из левой части в правую: сначала 98, потом 73, потом 64 и т.д.
Это напоминает всплытие больших пузырьков воздуха из левой части в правую

Временная сложность:

В наихудшем случае (когда массив отсортирован в обратном порядке), нам потребуется выполнить n-1 проходов по массиву,
где n - это количество элементов в массиве. Каждый проход требует проверки и, возможно, обмена пары элементов.
Внутренний цикл проверяет каждый элемент массива, что требует порядка n операций.
В результате временная сложность будет 𝑂(𝑛2)

Лучший случай:
В лучшем случае (когда массив уже отсортирован), алгоритм выполняет один проход по массиву и обнаруживает,
что не требуется обменов, поэтому завершает работу. Это требует 𝑂(𝑛) операций.

Средний случай
Во всех типичных реализациях сортировки пузырьком алгоритм проходит по массиву несколько раз, сравнивая и обменивая соседние элементы, если они находятся в неправильном порядке. В среднем случае временная сложность оценивается как
𝑂(𝑛2). Это связано с тем, что каждый элемент в среднем требует проверки с большинством других элементов массива.

Почему 𝑂(𝑛2)?
В среднем массив будет не отсортирован, и потребуется выполнить примерно половину всех возможных обменов. В каждом проходе внутренний цикл выполняет
𝑛−1 сравнений (и возможных обменов), где n — количество элементов в массиве.
Так как внешний цикл повторяется n раз (в худшем случае), общее количество операций сравнения будет пропорционально
n×(n−1)/2, что упрощается до 𝑂(𝑛2)

Пространственная сложность:
Сортировка пузырьком является алгоритмом сортировки на месте (in-place sort),
так как она не требует дополнительного массива или значительного объема дополнительной памяти для выполнения сортировки.
Единственная дополнительная память, которая требуется, — это временная переменная для обмена двух элементов массива.
Алгоритм использует одну дополнительную переменную для временного хранения данных во время обмена двух элементов.
Следовательно, объем дополнительной памяти не зависит от размера массива и является константным, что обозначается как
𝑂(1)

Оптимизация 1: можно не сравнивать уже отсортированные в правой части элементы
Оптимизация 2: можно через раз менять направление проверки - самый маленький элемент будет всплывать влево
 */
public class Sorting_shakers_advanced_bubbles {

    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 31, 53, 16, 57, 48, 55, 98, 2};
        int n = array.length; // сохраняем длину массива для уменьшения области сравнения
        boolean isSorted = false;
        System.out.println();
        System.out.println("Исходный массив: " + Arrays.toString(array));

        int iteration = 0; // счетчик итераций

        while (!isSorted) {
            isSorted = true;

            // Проход слева направо
            for (int i = 1; i < n; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }

            n--; // Уменьшаем область сравнения
            System.out.println("Область сравнения составляет " + n + " элементов");
            iteration++;
            System.out.println("Итерация " + iteration + ": " + Arrays.toString(array));

            if (isSorted) break;

            // Проход справа налево
            for (int i = n - 1; i >= 1; i--) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }

            n--; // Уменьшаем область сравнения
            System.out.println("Область сравнения составляет " + n + " элементов");
            iteration++;
            System.out.println("Итерация " + iteration + ": " + Arrays.toString(array));
        }

        System.out.println("Массив отсортирован за " + iteration + " итераций и после сортировки: " + Arrays.toString(array));
    }}
