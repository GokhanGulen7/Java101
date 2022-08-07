import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int add = 0, num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir Sayı Girin: ");
        num = sc.nextInt();

        while(num != 0)
        {
            add += (num % 10);
            num /= 10;
        }

        System.out.println("Basamak toplamı: " + add);
    }
}
