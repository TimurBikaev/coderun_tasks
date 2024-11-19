Этот метод работает за O(n), где n — длина строки, что делает его оптимальным для этой задачи.

  //А ВООБЩЕ САМЫЙ ПРОСТОЙ МЕТОД, НО НЕ БЫСТРЫЙ ПРИ ДЛИННОЙ СТРОКЕ - reverse строки и проверка на equals 

public boolean isStringPalindrome (String str) {
  //Exemple of palindrome is ABBA - строка читается с двух сторон одинаково 

      // Проверка на null или пустую строку
    if (str == null || str.isEmpty()) {
        return true;  // Считаем пустую строку палиндромом
    }

  int indexFirstChar = 0;   //начало строки
  int indexLastChar = str.length() - 1;   //конец строки

//далее сравниваем первый символ с последним, затем второй с предпоследним и т.д.

while (indexLastChar > indexFirstChar) { //пока индекс последнего больше индекса первого

          // Пропускаем не-буквенные и не-цифровые символы
        while (indexFirstChar < indexLastChar && !Character.isLetterOrDigit(str.charAt(indexFirstChar))) {
            indexFirstChar++;
        }
        while (indexFirstChar < indexLastChar && !Character.isLetterOrDigit(str.charAt(indexLastChar))) {
            indexLastChar--;
        }
  
  //проверяем идентичность символов без учёта регистра
 if (Character.toLowerCase(str.charAt(indexFirstChar)) != Character.toLowerCase(str.charAt(indexLastChar))) {//char сравниваются так == и !=
  return false;  // Если символы не совпадают, возвращаем false
 }
  
  indexFirstChar++; //увеличиваем индекс начального символа
  indexLastChar--; //уменьшаем индекс последнего символа

}
return true;
}


  //А ВООБЩЕ САМЫЙ ПРОСТОЙ МЕТОД, НО НЕ БЫСТРЫЙ ПРИ ДЛИННОЙ СТРОКЕ - reverse строки и проверка на equals 

    String text = "madam"; // пример строки для проверки
        if (isPalindrome(text)) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
    private static boolean isPalindrome(String text) {
        StringBuilder reversedText = new StringBuilder(text).reverse();
        return text.equals(reversedText.toString());
    }
