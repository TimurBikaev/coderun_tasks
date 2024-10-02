public class ReverseWord {

    public static void main(String[] args) {
        String s = "Azure is the best IT company!";
        System.out.println("Простой поворот строки " + reverseString(s));
        System.out.println("Поворот строки с сохранением порядка строк " + reverseWordCharacters(s));
        // Проверка результата
        System.out.println("!ynapmoc TI tseb eht si eruzA".equals(reverseString(s)));
        System.out.println("eruzA si eht tseb TI !ynapmoc".equals(reverseWordCharacters(s)));
    }

    // Используем StringBuilder для переворота всей строки
    public static String reverseString(String str) {
        // Создаём объект StringBuilder, который принимает строку str
        return new StringBuilder(str).reverse().toString(); //использован стандартный метод reverse().tiString()
    }

    /*
    StringBuilder — это специальный класс в Java, который позволяет эффективно изменять строки. В отличие от обычных строк (String),
    которые являются неизменяемыми (immutable), StringBuilder позволяет изменять содержимое строки без создания новых объектов в памяти.

    Почему строки неизменяемы?
    Обычные строки в Java (String) неизменяемы. Это означает, что каждый раз, когда вы изменяете строку
    (например, добавляете к ней что-то или изменяете символы), создаётся новый объект строки в памяти.
    Это может быть неэффективно, если нужно часто изменять строку (например, при конкатенации множества строк).

    Что делает StringBuilder?
    StringBuilder позволяет изменять строку (например, добавлять символы, удалять их или переворачивать)
    без создания нового объекта строки каждый раз. Это делает работу с изменяемыми строками намного более производительной.
     */

    //А это с сохранением порядка слов - перевернуты только слова по отдельности, а их порядок сохранен
    public static String reverseWordCharacters(String str) {
        // Разбиваем строку на слова по пробелам между ними то массив будет таким: ["Azure", "is", "the", "best", "IT", "company!"]
        String[] words = str.split(" ");
        //Создаём StringBuilder для итогового результата. Этот объект будет хранить перевёрнутые слова и помогать собирать финальную строку.
        StringBuilder reversedSentence = new StringBuilder();

        // Перебираем все слова и разворачиваем символы в каждом слове
        for (String word : words) {
            // Разворачиваем символы в текущем слове
            //Создаём StringBuilder из текущего слова. Например, если слово — "Azure", то создаётся объект StringBuilder, содержащий "Azure".
            StringBuilder reversedWord = new StringBuilder(word);
            //Добавляем перевёрнутое слово к итоговой строке.
            // После каждого перевёрнутого слова добавляется пробел, чтобы сохранить разделение между словами.
            reversedSentence.append(reversedWord.reverse().toString()).append(" ");
        }

        // Возвращаем строку, удаляя последний пробел
        return reversedSentence.toString().trim();
    }
    
    /*
    Метод reverseWordCharacters:

    Делит строку на слова.
    Для каждого слова переворачивает символы.
    Собирает перевёрнутые слова обратно в строку с пробелами между ними.
    Удаляет лишний пробел в конце с помощью trim().
     */

}
