import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number: ");
        int base = scanner.nextInt();
        System.out.print("Type the exponent: ");
        int exponent = scanner.nextInt();
        int result = power(base,exponent);
        System.out.println("Result: " + result);
        scanner.close();
    }

    static int power(int base, int exponent) {
        if (exponent == 0)
            return 1;
        else
            return base * power(base, exponent - 1);
    }
}