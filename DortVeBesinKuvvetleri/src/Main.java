import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        x = input.nextInt();

        System.out.println();

        System.out.println(x + " sayısına kadar dördün kuvveti olan sayılar:");
        for (int i = 1; i <= x; i *= 4) {
            System.out.println(i);
        }

        System.out.println();

        System.out.println(x + " sayısına kadar beşin kuvveti olan sayılar:");
        for (int j = 1; j <= x; j *= 5) {
            System.out.println(j);
        }
    }
}
