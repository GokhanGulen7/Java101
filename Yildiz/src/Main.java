import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int l = 1; l <= n; l++) {

            for (int m = 1; m <= l; m++) {
                System.out.print(" ");
            }

            for (int o = 1; o <= 2 * n - (2 * l + 1); o++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}
