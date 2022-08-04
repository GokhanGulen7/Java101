import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        n2 = input.nextInt();

        System.out.println();
        System.out.println("1-) Toplama\n2-) Çıkarma\n3-) Çarpma\n4-) Bölme");
        System.out.println();
        System.out.print("Seçiminiz: ");
        select = input.nextInt();
        System.out.println();

        switch (select) {
            case 1 -> System.out.println("Toplam = " + (n1 + n2));
            case 2 -> System.out.println("Fark = " + (n1 - n2));
            case 3 -> System.out.println("Çarpım = " + (n1 * n2));
            default -> System.out.println("Bölüm = " + (n1 / n2));
        }
    }
}
