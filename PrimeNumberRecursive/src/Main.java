import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        int number = scanner.nextInt();

        if (isPrime(number, number / 2))
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }

    static boolean isPrime(int number, int divisor) {
        if (divisor == 1)
            return true;
        else {
            if (number % divisor == 0)
                return false;
            else
                return isPrime(number, divisor - 1);
        }
    }
}