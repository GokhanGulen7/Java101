import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kalan;
        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum yılınızı girin: ");
        int yil = inp.nextInt();

        kalan = yil % 12;
        switch (kalan) {
            case 0 -> System.out.println("Çin Zodyağı Burcunuz : Maymun");
            case 1 -> System.out.println("Çin Zodyağı Burcunuz : Horoz");
            case 2 -> System.out.println("Çin Zodyağı Burcunuz : Köpek");
            case 3 -> System.out.println("Çin Zodyağı Burcunuz : Domuz");
            case 4 -> System.out.println("Çin Zodyağı Burcunuz : Fare");
            case 5 -> System.out.println("Çin Zodyağı Burcunuz : Öküz");
            case 6 -> System.out.println("Çin Zodyağı Burcunuz : Kaplan");
            case 7 -> System.out.println("Çin Zodyağı Burcunuz : Tavşan");
            case 8 -> System.out.println("Çin Zodyağı Burcunuz : Ejderha");
            case 9 -> System.out.println("Çin Zodyağı Burcunuz : Yılan");
            case 10 -> System.out.println("Çin Zodyağı Burcunuz : At");
            default -> System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}
