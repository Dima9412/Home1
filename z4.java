//Задача 4. Поиск и замена строк
//Реализуйте метод findAndReplace, который принимает массив строк, строку
//для поиска и строку для замены. Если искомая строка не найдена, добавьте
//сообщение об ошибке в список. Верните новый массив строк с выполненной
//заменой.

import java.util.ArrayList;
import java.util.List;

public class StringReplacer {

    public static String[] findAndReplace(String[] inputArray, String searchString, String replaceString) {
        List<String> resultList = new ArrayList<>();
        boolean found = false;

        for (String str : inputArray) {
            if (str.equals(searchString)) {
                resultList.add(replaceString);
                found = true; // Установим флаг, если нашли строку
            } else {
                resultList.add(str);
            }
        }

        // Если искомая строка не найдена, добавляем сообщение об ошибке
        if (!found) {
            resultList.add("Ошибка: строка \"" + searchString + "\" не найдена.");
        }

        // Преобразуем список обратно в массив
        return resultList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] inputArray = {"apple", "banana", "orange"};
        String searchString = "banana";
        String replaceString = "kiwi";

        String[] result = findAndReplace(inputArray, searchString, replaceString);

        // Вывод результата
        for (String str : result) {
            System.out.println(str);
        }
    }
}
