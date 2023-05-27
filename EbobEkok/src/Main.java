import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int x = input.nextInt();
        System.out.print("Type the second number: ");
        int y = input.nextInt();

        int gcd = 1; //gcd: greatest common divisor
        int lcm = 1; //lcm: least common multiple

        if (x > y) {
            for (int i = 1; i < x; i++) {
                if (x%i == 0 && y%i == 0) {
                    gcd = i;
                }
            }
        } else if (y > x) {
            for (int i = 1; i < y; i++) {
                if (x%i == 0 && y%i == 0) {
                    gcd = i;
                }
            }
        } else {
            gcd = x;
        }

        for (int i = 1; i <= (x * y); i++) {
            if (i % x == 0 && i % y == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("Greatest common divisor = " + gcd);
        System.out.println("Least common multiply = " + lcm);
    }
}