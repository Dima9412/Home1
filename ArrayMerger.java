//Задача 2. Объединение массивов с проверкой длины и содержимого
//        Реализуйте метод mergeAndValidateArrays, который принимает два
//        массива целых чисел. Метод должен объединить массивы и вернуть новый
//        массив. Если длины массивов не равны, выбрасывайте исключение
//        IllegalArgumentException. Если хотя бы один элемент объединенного
//        массива отрицательный, выбрасывайте исключение RuntimeException с
//        сообщением "Обнаружен отрицательный элемент".

import java.util.Arrays;

public class ArrayMerger {

    public static int[] mergeAndValidateArrays(int[] array1, int[] array2) {
        // Проверка на равенство длин массивов
        if (array1.length != array2.length) {
            throw new IllegalArgumentException("Длины массивов должны быть равны");
        }

        // Создание нового массива, который будет вдвое длиннее
        int[] mergedArray = new int[array1.length + array2.length];

        // Копирование элементов из первого массива
        System.arraycopy(array1, 0, mergedArray, 0, array1.length);
        // Копирование элементов из второго массива
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);

        // Проверка на наличие отрицательных элементов
        for (int element : mergedArray) {
            if (element < 0) {
                throw new RuntimeException("Обнаружен отрицательный элемент");
            }
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        try {
            int[] array1 = {1, 2, 3};
            int[] array2 = {4, 5, 6};
            int[] result = mergeAndValidateArrays(array1, array2);
            System.out.println("Результат: " + java.util.Arrays.toString(result));

            // Пример с отрицательным элементом
            int[] array3 = {1, -2, 3};
            int[] resultWithNegative = mergeAndValidateArrays(array1, array3);
            System.out.println("Результат: " + java.util.Arrays.toString(resultWithNegative));

        } catch (IllegalArgumentException | RuntimeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
        }

        return mergedArray;
    }

    public static void main(String[] args) {
        try {
            int[] array1 = {1, 2, 3};
            int[] array2 = {4, 5, 6};
            int[] result = mergeAndValidateArrays(array1, array2);
            System.out.println("Результат: " + java.util.Arrays.toString(result));
        } catch (IllegalArgumentException | RuntimeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}