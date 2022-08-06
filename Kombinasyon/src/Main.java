import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, fak1 = 1, fak2 = 1, fak3 = 1, com;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        x = scanner.nextInt();
        for (int i = 1; i <= x; i++) {
            fak1 *= i;
        }

        System.out.print("Bir sayı girin: ");
        y = scanner.nextInt();
        for (int j = 1; j <= y; j++) {
            fak2 *= j;
        }

        for (int k = 1; k <= Math.abs(x - y); k++) {
            fak3 *= k;
        }

        com = fak1 / (fak2 * fak3);

        System.out.println();

        System.out.println("C(" + x + "," + y + ") = " + com);
    }
}
