//Задание 1. Преобразование строки в число
//Реализуйте метод convertAndSum, который принимает массив строк, каждая
//из которых должна быть преобразована в целое число. Метод возвращает
//сумму всех чисел. Если хотя бы одна строка не может быть преобразована в
//число, метод должен выбросить исключение NumberFormatException.
//        Дополнительно, если сумма чисел превышает 100, выбрасывайте
//ArithmeticException с сообщением "Превышен лимит суммы".
//

public class Answer {
    public static int convertAndSum(String[] strings) {
        int sum = 0;
        for (String s : strings) {
            try {
                int number = Integer.parseInt(s);
                sum += number;
            } catch (NumberFormatException e) {

                throw new NumberFormatException ("Ошибка преобразования строки в число: " + s);
            }
        }
        if (sum > 100) {
            throw new ArithmeticException("Превышен лимит суммы");
        }

        return  sum;

    }

}

public class Printer {
    public  static void main(String[] args) {

        try {
            string[] strings = {"10", "20", "70"};
            System.out.println(Answer.convertAndSum(strings));

        } catch (NumberFormatException e) {
            Sustem.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            Sustem.out.println(e.getMessage());

        }

        try {
            String[] invalidStrings = {"10", "20", "abc"};

            System.out.println(Answer.convertAndSum(invalidStrings));

        } catch (NumberFormaException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try {
            String[] overLimitStrings = {"50", "60"};
Sustem.out.println(Answer.convertAndSum(overLimitStrings));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
    }
}