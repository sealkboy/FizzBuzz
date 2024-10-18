package fizzbuzz;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elige un número: ");
        int num = scanner.nextInt();
        System.out.println(fizzBuzz(num));
    }

    public static String fizzBuzz(int num) {
        String numStr = String.valueOf(num);

        boolean divisiblePor3 = num % 3 == 0 || numStr.contains("3");
        boolean divisiblePor5 = num % 5 == 0 || numStr.contains("5");

        if (divisiblePor3 && divisiblePor5) {
            return "FizzBuzz";
        } else if (divisiblePor3) {
            return "Fizz";
        } else if (divisiblePor5) {
            return "Buzz";
        } else {
            return String.valueOf(num);
        }
    }
}
