public class Main {
    public static void main(String[] args) {
        String str = "коооооот"; // Исходная строка с залипающими клавишами
        StringBuilder res = new StringBuilder(); //результирующая строка

        // Инициализация первого символа для сравнения
        char currentSymbol = str.charAt(0);
        res.append(currentSymbol); // Добавляем первый символ сразу!

        // Цикл начинается со второго символа
        for (int i = 1; i < str.length(); i++) {
            if (currentSymbol != str.charAt(i)) {
                res.append(str.charAt(i)); // Добавляем символ, если он не равен предыдущему
                currentSymbol = str.charAt(i); // Обновляем текущий символ
            }
        }

        // Вывод результата
        System.out.println("Результат: " + res.toString());
    }
}

