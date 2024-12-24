import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNumbersFromList {

    //Вывести уникальные значения из списка
    public static void main(String[] args) {
        //Список
        List<Integer> list = List.of(1,2,3,4,5,5,4);

        System.out.println(getUniqNumbers(list));



    }

    //метод принимает список и возвращает уникальное множество
    public static Set<Integer> getUniqNumbers(List<Integer> list) {
        Set<Integer> result = new HashSet<>(); // результат содержит только уникальные значения

        for (Integer i : list){
            result.add(i);
        }

        return result;

    }
