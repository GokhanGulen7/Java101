import java.util.Scanner;

public class NotOrtalamasi {
    static int math, physics, chemical, turkish, history, music;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Matematik Notunuz: ");
        math = input.nextInt();
        System.out.println();

        System.out.println("Fizik Notunuz: ");
        physics = input.nextInt();
        System.out.println();

        System.out.println("Kimya Notunuz: ");
        chemical = input.nextInt();
        System.out.println();

        System.out.println("Türkçe Notunuz: ");
        turkish = input.nextInt();
        System.out.println();

        System.out.println("Tarih Notunuz: ");
        history = input.nextInt();
        System.out.println();

        System.out.println("Müzik Notunuz: ");
        music = input.nextInt();
        System.out.println();

        int average = (math + physics + chemical + turkish + history + music) / 6;

        System.out.println("Not Ortalamanız: " + average);
        System.out.println();
        System.out.println(average > 60 ? "Sınıfı Geçtiniz!" : "Sınıfta Kaldınız...");
    }
}
