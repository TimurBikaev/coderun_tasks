import java.util.Stack;

/**
 * Напишите метод, который принимает строку, содержащую только скобки (), {}, [], и проверяет, является ли последовательность скобок корректной.
 * <p>
 * Корректная последовательность скобок:
 * <p>
 * Каждая открывающая скобка имеет соответствующую закрывающую.
 * Скобки открываются и закрываются в правильном порядке.
 * Например:
 * "(){}[]" — корректно.
 * "{[()]}" — корректно.
 * "{[(])}" — некорректно.
 * "((()" — некорректно.
 */

public class BracketsChecking {

    public static void main(String[] args) {


        String brackets1 = "(){}[]";
        String brackets2 = "{[()]}";
        String brackets3 = "{[(])}";
        String brackets4 = "((()";

        System.out.println(bracketsIsValid(brackets1)); // true
        System.out.println(bracketsIsValid(brackets2)); // true
        System.out.println(bracketsIsValid(brackets3)); // false
        System.out.println(bracketsIsValid(brackets4));   // false


    }

    /**
     * Решается с помощью стэка: когда встречается открывающая скобка { [ ( -- добавляем её в стэк
     Когда встречается закрывающая скобка ) ] } -- проверяем лежит ли сверху в стэке соответствующая открывающая.
    Если скобка сверху стека не соотв.ожидаемой или стек пуст — последовательность некорректна.
    Если скобка сверху стека соотв. ожидаемой - удаляем её из стека и проверяем след. элемент
    Если элементы просмотрены, но скобки остались в стэке -- последовательность некорректна.
     */

    // Метод для проверки соответствия пары скобок - возвращает TRUE при выполнении условий
    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static Boolean bracketsIsValid(String brackets) {

        Stack<Character> stack = new Stack<>();

        System.out.println(brackets);

        for (int i = 0; i < brackets.length(); i++) {

            char current = brackets.charAt(i);

            // Если текущий символ - открывающая скобка, добавляем в стек
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            }

            //если встретили закрывающую - проверяем стэк
            else if (current == ')' || current == '}' || current == ']') {

                // Если стек пуст ИЛИ верхний элемент не соответствует текущему символу, возвращаем false
                //stack.pop() - берет возвращает элемент из стопки и удаляет его после этого
                if (stack.empty() || !isMatchingPair(stack.pop(), current)) {
                    return false;
                }

            }


        }


        System.out.println("Stack к концу проверки: " + stack);

        /**
         * метод bracketsIsValid возвращает true только в конце, когда стек пуст,
         * и это означает, что все открывающие скобки имели соответствующие закрывающие и они были правильно расположены.
         */


        if (stack.empty()) {
            return true;
        } else return false;

    }


}
