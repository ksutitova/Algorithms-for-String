public class Algorithms {
    /**
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
     * Написать алгоритм RemoveAllSpaces.
     * алгоритм, который принимает на вход строку.
     * Если строка валидная, то метод удаляет все пробелы из строки, если таковые имеются.
     * Метод возвращает обработанную строку.
     * Test Data:
     * “    QA   4  Everyone   “ →  “QA4Everyone“
     * “p a     n d a   “ → “panda”
     */

    public static String removeAllSpaces(String str) {
//        str = str.trim();
        if (str.isEmpty() == false) {
            str = str.replace(" ", "");
        }
        return str;
    }


    public static void main(String[] args) {
        System.out.println(deleteSpaces("    QA4Everyone   "));
        System.out.println(deleteSpaces("QA4Everyone"));
        System.out.println(deleteSpaces(""));

        System.out.println(removeAlla("    QA4Everyone   "));
        System.out.println(removeAlla("panda   "));

        System.out.println(removeAllZeros("   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 "));
        System.out.println(removeAllZeros(" 0000000111"));

        System.out.println(removeAllSpaces("    QA   4  Everyone   "));
        System.out.println(removeAllSpaces("p a     n d a   "));

    }


}

/**
 *
 */

