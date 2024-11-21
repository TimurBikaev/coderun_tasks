import org.testng.Assert;

public class Main {
    public static void main(String[] args) {

        //Является ли число четным (четное) и наоборот
        numIsEvenOrOdd(3);

        //Вывести все значения от 1 до 100 которые делятся на 3 и 5
        System.out.println("значения от 1 до 100 которые делятся на 3 и 5: " + division3and5());

        //Проверки чисел на деление на 3 и 5
        int num1 = 15;
        int num2 = 16;
        Assert.assertTrue(checkDevision(num1));
        Assert.assertTrue(checkDevision2(num1));
        message("Деление на 3 и 5 числа " + num1 + " " + checkDevision(num1));
        Assert.assertFalse(checkDevision(num2));
        message("Деление на 3 и 5 числа " + num2 + " " + checkDevision(num2));


        //Задача на факториал числа
        System.out.println("Факториал " + factorial(5));


    }

    //Вывести все значения от 1 до 100 которые делятся на 3 и 5
    public static String division3and5() {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append(i).append(" ");
            }
        }

        return result.toString().trim(); // Возвращаем строку без лишних пробелов
    }


    //Метод для подсчета факториала числа

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i < num + 1; i++) {
            fact = fact * i;
        }

        return fact;
    }

    //Является ли число четным (четное) и наоборот
    public static void numIsEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("Even");
        } else System.out.println("Odd");

    }


    //Проверки чисел на деление на 3 и 5
    public static Boolean checkDevision(int num) {
        //сюда можно добавить проверки на число или нет, на null, на NaN
        return num % 3 == 0 && num % 5 == 0;
    }
    //Проверки чисел на деление на 3 и 5
    public static Boolean checkDevision2(int num) {
        //сразу возврат
        return num % 3 == 0 && num % 5 == 0;
    }

    //метод для удобного вывода в консоль
    public static void message(String message) {
        System.out.println();
        System.out.println(message);
        System.out.println();
    }

}
