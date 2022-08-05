import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat, fiz, tur, kim, muz, ort = 0, sayac = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik puanınız: ");
        mat = input.nextDouble();

        while (mat < 0 || mat > 100) {
            System.out.println("0 ile 100 arasında bir değer girin.");
            System.out.print("Matematik puanınız: ");
            mat = input.nextDouble();
        }
            ort += mat;
            sayac += 1;

        System.out.print("Fizik puanınız: ");
        fiz = input.nextDouble();

        while (fiz < 0 || fiz > 100) {
            System.out.println("0 ile 100 arasında bir değer girin. ");
            System.out.print("Fizik puanınız: ");
            fiz = input.nextDouble();
        }
            ort += fiz;
            sayac += 1;

        System.out.print("Türkçe puanınız: ");
        tur = input.nextDouble();

        while (tur < 0 || tur > 100) {
            System.out.println("0 ile 100 arasında bir değer girin. ");
            System.out.print("Türkçe puanınız: ");
            tur = input.nextDouble();
        }
            ort += tur;
            sayac += 1;

        System.out.print("Kimya puanınız: ");
        kim = input.nextDouble();

        while (kim < 0 || kim > 100) {
            System.out.println("0 ile 100 arasında bir değer girin. ");
            System.out.print("Kimya puanınız: ");
            kim = input.nextDouble();
        }
            ort += kim;
            sayac += 1;

        System.out.print("Müzik puanınız: ");
        muz = input.nextDouble();

        while (muz < 0 || muz > 100) {
            System.out.println("0 ile 100 arasında bir değer girin. ");
            System.out.print("Müzik puanınız: ");
            muz = input.nextDouble();
        }
            ort += muz;
            sayac += 1;

        ort = ort / sayac;

        System.out.println("Not ortalamanız: " + ort);

        if (ort < 55) {
            System.out.println("Sınıfta kaldınız...");
        } else {
            System.out.println("Sınıfı geçtiniz!");
        }
    }
}