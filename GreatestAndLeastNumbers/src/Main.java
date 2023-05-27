import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type how many numbers you will type: ");
        int n = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            String ordinalIndicator = getOrdinalIndicator(i);
            System.out.print("Type the " + i + ordinalIndicator + " number: ");
            int num = scanner.nextInt();

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("The greatest number: " + max);
        System.out.println("The least number: " + min);
    }

    public static String getOrdinalIndicator(int number) {
        if (number >= 11 && number <= 13) {
            return "th";
        } else {
            int lastDigit = number % 10;
            return switch (lastDigit) {
                case 1 -> "st";
                case 2 -> "nd";
                case 3 -> "rd";
                default -> "th";
            };
        }
    }
}