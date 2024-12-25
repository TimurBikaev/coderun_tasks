/**
 * Напишите метод, который принимает строку, содержащую только скобки (), {}, [], и проверяет, является ли последовательность скобок корректной.
 * <p>
 * Корректная последовательность скобок:
 * <p>
 * Каждая открывающая скобка имеет соответствующую закрывающую.
 * Скобки открываются и закрываются в правильном порядке.
 * Например:
 * "(())" — корректно.
 * "((()" — некорректно.
 */

public class BracketsChecking2 {

    public static void main(String[] args) {


        String brackets1 = "(())";
        String brackets2 = "((()";
        String brackets3 = ")()(";
        String brackets4 = "())(";

        System.out.println("РЕЗУЛЬТАТЫ");
        System.out.println("Для " + brackets1 + " результат " + bracketsIsValid(brackets1)); // true

        System.out.println("Для " + brackets2 + " результат " + bracketsIsValid(brackets2)); // false

        System.out.println("Для " + brackets3 + " результат " + bracketsIsValid(brackets3)); // false

        System.out.println("Для " + brackets4 + " результат " + bracketsIsValid(brackets4)); // false


    }

    /**
     * Алгоритм: 1) проверяем первый символ - если ) или строка пуста - то сразу false
     * Далее идем по символам:
     * 2) Если открывающая - увеличиваем "счетчик пары"
     * 3) Если закрывающая - уменьшаем "счетчик пары"
     * 4) В конце счетчик должен быть 0, это будет означать что каждой открытой соотв.закрытая
     */

    public static boolean bracketsIsValid(String brackets) {

        int count = 0;

        //если начинается с закр.скобки - сразу false
        if (brackets.isEmpty() || brackets.charAt(0) == ')') {
            return false;
        } else {
            System.out.println("for");
            for (int i = 0; i < brackets.length(); i++) {
                char c = brackets.charAt(i);
                System.out.println(c);
                System.out.println("index " + i);
                if (c == '(') {
                    count++;
                    System.out.println(count);
                } else if (c == ')' && count == 0) { //для предотвращения такого случая ())(
                    return false;
                } else if (c == ')') {
                    count = count - 1;
                    System.out.println(count);
                }

            }

            if (count == 0) {
                return true;
            } else return false;
        }
    }


}

