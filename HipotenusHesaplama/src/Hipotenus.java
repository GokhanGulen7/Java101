import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {

        double a, b, c, u, cevre, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci dik kenarın uzunluğunu girin: ");
        a = input.nextDouble();
        System.out.print("İkinci dik kenarın uzunluğunu girin: ");
        b = input.nextDouble();

        c = Math.sqrt(a*a + b*b);
        System.out.println("Hipotenüs uzunluğu: " + c);

        cevre = a + b + c;
        u = cevre / 2;

        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin Çevresi: " + cevre);
        System.out.println("Üçgenin Alanı: " + alan);
    }
}
