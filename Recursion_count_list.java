import java.util.Arrays;
import java.util.List;

//Рекурсивную функцию для подсчета элементов в списке.
class Recursion_count_list {

    //метод рекурсивно считает кол-во элементов в полученном списке list
    public static int countElements(List<?> list) { //Вызов countElements([1, 2, 3, 4, 5])
        //Если список пустой (list.isEmpty()), то возвращаем 0. Это базовый случай, когда рекурсия завершается.
        if (list.isEmpty()) {
            return 0; //Когда функция обнаруживает, что список пустой, она возвращает значение (в данном случае 0) и завершает свою работу.
        } else { //иначе, если не пустой, прибавляем 1 (за текущий элемент) к рекурсивному вызову этой же функции для числа элементов начиная с [1]
            //подсписок sublist не содержит [0]
            return 1 + countElements(list.subList(1, list.size()));
            //здесь поочередно вызывается
            // countElements([2, 3, 4, 5])
            // countElements([3, 4, 5])
            // countElements([4, 5])
            // countElements([5])
            // выход из цикла при countElements([])
            //return 1(вызов1) + 1(вызов2) + 1(вызов3) + 1(вызов4) + 1(вызов5) + 0 (выход)
        }
    }

    //Пример вызова countElements() для списка
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Количество элементов в списке: " + countElements(myList));
    }
}
