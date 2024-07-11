import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Алгоритм быстрой сортировки основан на стратегии "разделяй и властвуй", где массив разбивается на подмассивы, сортируются отдельно, а затем объединяются.
В данной программе определяется базовый случай для завершения рекурсии (массивы с 0 или 1 элементом уже "отсортированы").
Опорный элемент выбирается (первый элемент списка), а затем остальные элементы списка разделяются на два подмассива: те, что меньше или равны опорному, и те, что больше опорного.
Рекурсивно вызывается функция quicksort для двух подмассивов (less и greater) и затем объединяются с опорным элементом в правильном порядке.
 */
public class Sort_quick {
    public static void main(String[] args) {
        // Пример использования быстрой сортировки
        System.out.println(quicksort(Arrays.asList(10, 5, 2, 3))); // [2, 3, 5, 10]
    }

    private static List<Integer> quicksort(List<Integer> list) {
        if (list.size() < 2) {
            // Базовый случай: массивы с 0 или 1 элементом уже "отсортированы"
            return list; //возвращаем просто список
        } else {
            //Integer pivot = list.get(0); // Опорный элемент (первый элемент)
            // Получаем рандомный индекс
            int randomIndex = new Random().nextInt(list.size());
            // Опорный элемент это рандомный элемент списка, т.к. получается в среднем быстрее со сложностью О(п log п) как для лучшего случая
            Integer pivot = list.get(randomIndex);

            // Список всех элементов, меньших или равных опорному (пойдут в левую часть)
            List<Integer> less = new ArrayList<>();
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) <= pivot) { //если <= опорного, то добавляем в список less
                    less.add(list.get(i));
                }
            }


            // Список всех элементов, больших опорного
            List<Integer> greater = new ArrayList<>();
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) > pivot) { //если больше опорного, то добавляем в список greater
                    greater.add(list.get(i));
                }
            }


            List<Integer> result = new ArrayList<>(); // Объединяем результаты рекурсивных вызовов в один список:
            result.addAll(quicksort(less));      // 1. Отсортированный список "less"
            result.add(pivot);                  // 2. Опорный элемент "pivot"
            result.addAll(quicksort(greater)); // 3. Отсортированный подмассив "greater"
            return result;

        }
    }
}
