import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите максимальное число ->");
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int arraySize;
        boolean validNumber = false;

        while (!validNumber) {
            try {
                arraySize = Integer.parseInt(input);
                validNumber = true;
                printArray(createArray(arraySize));

            } catch (NumberFormatException e) {
                System.out.println("Введённые символы не являются числом. \nПовторите ввод -> ");
                input = sc.nextLine();
            }
        }

    }

    /**
     * Функция для создания и заполнения массива
     *
     * @param arraySize - размер массива, полученного от пользователя
     * @return - возвращает заполненный массив
     */
    private static int[] createArray(int arraySize) {
        int[] array = new int[arraySize + 1]; // +1 добавлено для корректности создания массива под условия задачи.
        for (int i = 0; i < array.length; i++) {
            {
                array[i] = i;
            }
        }
        return array;
    }

    /**
     * Метод вывода элементов массива.
     *
     * @param array созданный массив
     */
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println(array[i]);
            } else if (array[i] % 3 == 0 && array[i] % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (array[i] % 3 == 0) {
                System.out.println("fizz");
            } else if (array[i] % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(array[i]);
            }
        }
    }
}
