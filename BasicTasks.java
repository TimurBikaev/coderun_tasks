import org.testng.Assert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Базовые операции в Java
        //Задача 4: Перевод градусов Цельсия в Фаренгейты
        Assert.assertEquals(celsToFaringate(25), 77);

        //Задачи на if и switch
        //Задача 4: Проверка возраста
        System.out.println();
        System.out.println("Проверка граничных значений");
        Assert.assertEquals(checkAge(0), "Ребенок");
        Assert.assertEquals(checkAge(12), "Ребенок");
        Assert.assertEquals(checkAge(13), "Подросток");
        Assert.assertEquals(checkAge(17), "Подросток");
        Assert.assertEquals(checkAge(18), "Взрослый");
        Assert.assertEquals(checkAge(64), "Взрослый");
        Assert.assertEquals(checkAge(65), "Пенсионер");

        //Задачи на for
        //Задача 3: Таблица умножения для числа
        multiplicationTable(3);

        //Задачи на вложенные циклы
        //Задача 1: Таблица умножения
        multiplicationTableForAllDigits();

        //Задача 5: Шахматная доска
        //Выведите шахматную доску размером N x N, где клетки чередуются символами # и .
        //версия с вводом в консоль
        chessBoard();
    }


    //Реализация методов

    public static int celsToFaringate(int c) {

        int f = c * 9 / 5 + 32;
        System.out.println();
        System.out.println(c + " градусов Цельсия это " + f + " градусов по Фарингейту");

        return f;
    }

    public static String checkAge(int age) {

        //  if (age<0)
        String res = "Некорректный возраст";


        if (0 <= age && age < 13) {
            res = "Ребенок";
        }
        if (12 < age && age < 18) {
            res = "Подросток";
        }
        if (17 < age && age < 65) {
            res = "Взрослый";
        }
        if (64 < age) {
            res = "Пенсионер";
        }

        System.out.println(age + " лет это " + res);
        return res;

    }

    public static void multiplicationTable(int num) {
        System.out.println();
        System.out.println("Таблица умножения на " + num);
        System.out.println("*****************************");

        for (int i = 1; i < 11; i++) {
            System.out.println();
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println();
        System.out.println("*****************************");

    }

    public static void multiplicationTableForAllDigits() {
        System.out.println();
        System.out.println("Таблица умножения от 1 до 10");
        System.out.println("*****************************");

        for (int num = 1; num < 11; num++) { //ПРОСТО ОБЕРНУТЬ В ДРУГОЙ ЦИКЛ FOR
            System.out.println();
            System.out.println("Таблица умножения на " + num + ":");
            for (int i = 1; i < 11; i++) {
                System.out.println();
                System.out.println(num + " x " + i + " = " + (num * i));
            }
            System.out.println("-----------------");
        }
    }


    public static void chessBoard() {

        Scanner scanner = new Scanner(System.in);

        // Ввод размера доски
        System.out.print("Введите размер доски (N): ");
        int n = scanner.nextInt();


        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                //проверяем n на четность, тогда .
                //if((row+col)%2==0){
                if((row+col)%2==0){
                    System.out.print("#");  //без перехода на новую строку!
                }
                else
                    System.out.print("_"); //без перехода на новую строку!
            }
            System.out.println(); //переход на новую строку

            /**
             Проверка на чётность суммы индексов строки и столбца — это удобный способ чередовать клетки на шахматной доске, потому что она гарантирует правильный узор.

             Почему работает проверка суммы?
             Смысл суммы row + col:

             Индексы строки (row) и столбца (col) определяют положение клетки на доске.
             Сложив эти индексы, мы получаем одно число, которое можно проверить на чётность.
             Чётная сумма индексов (row + col):

             Если сумма чётная, то клетка будет одного типа (например, #).
             Пример:
             (0, 0): 0 + 0 = 0 (чётная, #).
             (0, 2): 0 + 2 = 2 (чётная, #).
             (1, 1): 1 + 1 = 2 (чётная, #).
             Нечётная сумма индексов:

             Если сумма нечётная, то клетка будет другого типа (например, .).
             Пример:
             (0, 1): 0 + 1 = 1 (нечётная, _).
             (1, 0): 1 + 0 = 1 (нечётная, _).
             (1, 2): 1 + 2 = 3 (нечётная, _).

             Проверка только n на чётность никак не помогает задать чередующийся узор.
             Проверка суммы индексов row + col позволяет чётко чередовать клетки, независимо от размера доски.
             */

        }

   @Test
    //сумма четных чисел от 0 до 10
    void sumOfOdd () {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if(i % 2 != 0)
            {
                System.out.println(i + " - нечетное, пропускаем через continue");
                continue;
            }
            sum+=i;
            System.out.println(sum);
        }
    }

        


    }


}
