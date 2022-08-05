import java.util.Scanner;

public class Main {
    static double x, sayac = 0, ort, toplam = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Sayı girin: ");
        x = input.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                sayac++;
                toplam += i;
            }
        }
        ort = toplam / sayac;
        System.out.println(ort);
    }
}
