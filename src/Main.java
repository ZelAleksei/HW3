import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число ->");
        Scanner sc = new Scanner(System.in);
        int maxNumber = sc.nextInt();;

        for (int i = 0; i <= maxNumber; i++) {
            if (i == 0) {
                System.out.print(i + " ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("fizzbuzz ");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");
            } else if (i % 5 == 0) {
                System.out.print("buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}

