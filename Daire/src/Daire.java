import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double pi = 3.14, r, a, y, cevre, alan, alan2;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçapı girin: ");
        r = input.nextDouble();

        cevre = 2 * pi * r;
        alan = Math.pow(r,2)*pi;

        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Dairenin Alanı: " + alan);

        Scanner type = new Scanner(System.in);
        System.out.print("Yarıçapı girin: ");
        y = type.nextDouble();
        System.out.print("Açıyı girin: ");
        a = type.nextDouble();

        alan2 = pi * y * y * a / 360;
        System.out.println("Daire Diliminin Alanı: " + alan2);
    }
}
