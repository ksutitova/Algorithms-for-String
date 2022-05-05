import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

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
//        str = str.trim();
        if (str.isEmpty() == false) {
            str = str.replace(" ", "");
        }
        return str;
    }

    /**
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
                if (str.contains(a) == true) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
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


    public static void main(String[] args) {

        System.out.println(java("As of March 2022, Java 18 is the latest version, while Java 17, " +
                "11 and 8 are the current long-term support (LTS) versions. Oracle released the last zero-cost public " +
                "update for the legacy version Java 8 LTS in January 2019 for commercial use, although it will " +
                "otherwise still support Java 8 with public updates for personal use indefinitely. " +
                "Other vendors have begun to offer zero-cost builds of OpenJDK 8 and 11 that are still receiving " +
                "security and other upgrades."));
        System.out.println(java("As a decrepit father takes delight\n" +
                "To see his active child do deeds of youth,\n" +
                "So I, made lame by fortune’s dearest spite,\n" +
                "Take all my comfort of thy worth and truth.\n" +
                "For whether beauty, birth, or wealth, or wit,\n" +
                "Or any of these all, or all, or more,\n" +
                "Entitled in thy parts do crownèd sit,\n" +
                "I make my love engrafted to this store.\n" +
                "So then I am not lame, poor, nor despised,\n" +
                "Whilst that this shadow doth such substance give\n" +
                "That I in thy abundance am sufficed,\n" +
                "And by a part of all thy glory live.\n" +
                "Look what is best, that best I wish in thee.\n" +
                "This wish I have; then ten times happy me"));
    }


}

/**
 *
 */

