import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n, add = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextDouble();

        for (double i = 1; i <= n; i++) {
            add += 1/i;
        }

        System.out.println("Result = " + add);
    }
}
