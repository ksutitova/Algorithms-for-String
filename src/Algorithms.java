public class Algorithms {
    /**
     * 1
     * Написать метод, который принимает на вход строку.
     * Если строка не пустая (проверить методом из видео), то примените метод по удалению пробелов в начале строки и в конце строки.
     * Догадаться, каким методом из видео можно проверить, были ли пробелы.
     * Если пробелы были, то метод должен вернуть сообщение: “Лишние пробелы удалены”.
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая, вернуть сообщение “Строка пустая”.
     * <p>
     * Test Data:
     * “    QA4Everyone   “ → “Лишние пробелы удалены”
     * “QA4Everyone“ → “Пробелов не было”
     * “” → “Строка пустая”
     */

    public static String deleteSpaces(String str) {
        if (str.isEmpty() == false) {
            String str1 = str.trim();
            if (str.length() == str1.length()) {
                return "Пробелов не было";
            } else {
                return "Лишние пробелы удалены";
            }
        }
        return "Строка пустая";
    }

    /**
     * 2
     * Написать алгоритм RemoveAlla.
     * написать алгоритм, который принимает на вход строку.
     * Если строка валидная, то метод удаляет все буквы a из строки, если таковые имеются.
     * Метод возвращает обработанную строку.
     * Test Data:
     * “    QA4Everyone   “ →  “QA4Everyone“
     * “panda   “ → “pnd”
     */

    public static String removeAlla(String str) {
        str = str.trim();
        if (str.isEmpty() == false) {
            str = str.replace("a", "");
        }
        return str;
    }


    /**
     * 3
     * Написать алгоритм RemoveAllZeros.
     * алгоритм, который принимает на вход строку,
     * состоящую из цифр. Если строка валидная, то метод удаляет все пробелы из строки,
     * если таковые имеются. Метод возвращает обработанную строку, в которой нет нулей.
     * Test Data:
     * “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
     * “ 0000000111“ → “111”
     */

    public static String removeAllZeros(String str) {
        str = str.trim();
        if (str.isEmpty() == false) {
            str = str.replace(" ", "");
            str = str.replace("0", "");
        }
        return str;
    }

    /**
     * 4
     * Написать алгоритм RemoveAllSpaces.
     * алгоритм, который принимает на вход строку.
     * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
     * Метод возвращает обработанную строку.
     * Test Data:
     * “    QA   4  Everyone   “ →  “QA4Everyone“
     * “p a     n d a   “ → “panda”
     */

    public static String removeAllSpaces(String str) {
        if (str.isEmpty() == false) {
            return str.trim().replace(" ", "");
        }
        return " ";
    }

    /**
     * 5
     * Напишите метод, который принимает на вход строку и считает, сколько букв а или А содержится в строке.
     * Test Data:
     * “Abracadabra” → 5
     * “Homenum Revelio” → 0
     */
    public static int countsLettersInAString(String str, String a) {
        int count = 0;
        if (str.isEmpty() == false) {
            str = str.toLowerCase();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a' ) {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    /**
     * 6
     * Напишите метод, который принимает на вход текст и проверяет, содержится ли в тексте хотя
     * бы одно слово Java.
     */
    public static boolean java(String text) {
        if (text.isEmpty() == false) {
            if (text.contains("Java") == true) {
                return true;
            }
        }
        return false;
    }

    /**
     * 7
     * Напишите метод, который принимает на вход строку, и добавляет Кавычки
     * в начале строки, точку и кавычки в конце строки с помощью метода concat()
     */
    public static String addQuotationMarks(String str) {
        String s = "\"";
        str = str.trim();
        return s.concat(str).concat(".\"");
    }

    /**
     * 8
     * Напишите метод, кторый принимает на вход название города и исправляет написание:
     * Test Data:
     * “ташкент” → “Ташкент”
     * “ЧикаГО” → “Чикаго”
     */

    public static String nameSity(String sity) {
        if (sity.isEmpty() == false) {
            sity.trim();
            return (sity.substring(0, 1).toUpperCase()).concat(sity.substring(1).toLowerCase());
        }
        return "Error";
    }


    /**
     * 9
     * Напишите метод, который принимает на вход строку, и возвращает все,
     * что находится между первой и последней буквой-параметром:
     * Test Data:
     * “Abracadabra”, “b” → “bracadab”
     * “Whippersnapper”, “p” → “ppersnapp”
     */
    public static String indexOneLast(String s, String index) {
        if (s.isEmpty() == false) {
            s.trim();
        }
        return s.substring(s.indexOf(index), s.lastIndexOf(index));
    }


    /**
     * 10
     * Напишите метод, который принимает на вход слово, и возвращает true,
     * если слово начинается и заканчивается на одинаковую букву, и faulse иначе
     * Test Data:
     * “Abracadabra” → true
     * “Whippersnapper” → false
     */


    public static boolean oneLast(String s) {
        if (s.isEmpty() == false) {
            s.trim().toLowerCase();
            return s.substring(0, 1).equals(s.substring(s.length() - 1));
        }
        return false;
    }


    /**
     * 11
     * Напишите метод, который принимает на вход предложение и возвращает
     * слова из этого предложения в виде массива слов
     * Test Data:
     * “QA for Everyone” → {“QA”, “for”, “Everyone”}
     * “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */

    public static String[] ArrayString(String str) {
        if (str.isEmpty() == false) {
            str.trim();
        }
        String[] arrayStr = str.split(" ");
        return arrayStr;
    }


    /**
     * 12
     * Написать метод, который принимает на вход предложение, которое состоит из имени,
     * фамилии, отчества и возвращает массив строк:
     * Test Data:
     * “Александр Сергеевич Пушкин” →
     * {“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”}
     */

    public static String[] arrayName(String str) {
        if (str.isEmpty() == false) {
            str.trim();
            String[] arrayStr = str.split(" ");
            System.out.println("\"Имя: " + arrayStr[0] + "\" , \"Отчество: " + arrayStr[1] +
                    "\" , \"Фамилия: " + arrayStr[2] + "\" ");
            return arrayStr;
        }
        return new String[]{};
    }


    /**
     * 13   //аскитаблица
     * Написать метод, который возвращает сумму всех букв слова
     * “abc” → 294
     * “ABC” → 198
     * “123” → 0 (это не буквы)
     */

    public static int sumABC(String str) {
        if (str.isEmpty() == false) {
            str.trim();
            int sum = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 64 && str.charAt(i) < 91 || str.charAt(i) > 96 && str.charAt(i) < 123) {
                    sum += str.charAt(i);
                }
            }
            return sum;
        }
        return 0;
    }


    /**
     * 13
     * Написать метод,  который принимает на вход 2 буквы и возвращает true,
     * если первая буква встречается раньше второй, иначе метод возвращает false
     * method(“a”, “m”) → true
     * method(“m”, “l”) → false
     */
    public static Boolean AM(char a, char m) {
        if ((a > 64 && a < 91 || a > 96 && a < 123) && (m > 64 && m < 91 || m > 96 && m < 123)) {
            return Character.toLowerCase(a) < Character.toLowerCase(m);
        }
        return null;
    }


    /**
     * 14
     * Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
     * Test Data:
     * “1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
     * (Без форматирования)
     */

    public static String[] stringToNumbers(String str) {
        String[] arrayString = str.split(",");
        return arrayString;
    }

    /**
     * 15
     * Написать 4 алгоритма StringToLetters, StringToLettersAndSpaces, StringToNumbers, StringToNumbersAndSpaces следуя примеру на сайте: https://allcalc.ru/node/2030
     * Каждый алгоритм принимает строку,  и удаляет ненужные символы:
     * удалить все кроме букв
     */

    public static String stringToLetters(String str) {
        String result = "";
        if (str.isEmpty() == false) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    result = result + str.charAt(i);
                }
            }
        }
        return result;
    }


    public static String stringToLettersAndSpaces(String str) {
        String result = "";
        if (str.isEmpty() == false) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90 ||
                        str.charAt(i) >= 97 && str.charAt(i) <= 122 ||
                        str.charAt(i) == 32) {
                    result = result + str.charAt(i);
                }
            }
        }
        return result;
    }

    public static String stringToNumber(String str) {
        String result = "";
        if (str.isEmpty() == false) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1' || str.charAt(i) == '2' ||
                        str.charAt(i) == '3' || str.charAt(i) == '4' ||
                        str.charAt(i) == '5' || str.charAt(i) == '6' ||
                        str.charAt(i) == '7' || str.charAt(i) == '8' ||
                        str.charAt(i) == '9' || str.charAt(i) == '0' ) {
                    result = result + str.charAt(i);
                }
            }
        }
        return result;
    }

    public static String stringToNumberVar2(String str) {
        String result = "";
        if (str.isEmpty() == false) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                    result = result + str.charAt(i);
                }
            }
        }
        return result;
    }

    public static String StringToNumbersAndSpaces(String str) {
        String result = "";
        if (str.isEmpty() == false) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) > 47 && str.charAt(i) < 58 || str.charAt(i) == ' ' ) {
                    result = result + str.charAt(i);
                }
            }
        }
        return result;
    }


    /**
     * 16
     * Напишите алгоритм CountWords, который принимает на вход текст и слово,
     * и считает все вариации этого слова в тексте:
     */

    public static int countWords(String text, String word) {
        if (text.isEmpty() == false && word.isEmpty() == false) {
            text.toLowerCase().replace(",", " ").replace(".", " ");
            word = word.toLowerCase();
            String[] arr = text.split(" ");
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(word)) {
                    count++;
                }
            }
            return count;
        }
        return -1;
    }

    /** 18
     * Написать алгоритм ReverseString, который переворачивает строку:
     Test Data:
     “Abracadabra” → “arbadacarbA”
     */

    public String reverseString(String str){
        if( str != null && str.length() > 0){
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--){
                reverse = reverse.concat(Character.toString(str.charAt(i)));
            }
            return reverse;
        }
        return "";
    }

    /**
     * 20 removeDuplicates
     */

    public String removeDuplicatesAlgorithm(String text) {
        String result = " ";
        if (text != " ") {
            text = text.toLowerCase();
            for (int i = 0; i < text.length(); ) {
                result += String.valueOf(text.charAt(i));
                text = text.replace(String.valueOf(text.charAt(i)), " ");
            }
            return result;
        }
        return result;
    }


}
