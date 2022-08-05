import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, toplam = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin: ");
        x = input.nextInt();

        while (x % 2 == 0) {
            System.out.print("Sayı girin: ");
            x = input.nextInt();
            toplam += x;
            if (x % 2 == 1) {
                System.out.println("Toplam = " + (toplam + x));
            }
        }
    }
}
