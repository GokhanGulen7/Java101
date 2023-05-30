import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String menu = """
                1- Addition
                2- Subtraction
                3- Multiplication
                4- Division
                5- Exponentiation
                6- Factorial
                7- Modular arithmetic
                8- Area and Perimeter Calculation of a Rectangle
                0- Exit""";

        System.out.println(menu);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Make a choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: add(); break;
            case 2: sub(); break;
            case 3: mul(); break;
            case 4: div(); break;
            case 5: exp(); break;
            case 6: fac(); break;
            case 7: mod(); break;
            case 8: measure(); break;
            case 0: break;
            default:
                System.out.println("Wrong choice!");
        }
    }

    static void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the first number: ");
        double x = scanner.nextDouble();
        System.out.print("Type the second number: ");
        double y = scanner.nextDouble();
        System.out.println("Result = " + (x + y));
    }

    static void sub() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the first number: ");
        double x = scanner.nextDouble();
        System.out.print("Type the second number: ");
        double y = scanner.nextDouble();
        System.out.println("Result = " + (x - y));
    }

    static void mul() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the first number: ");
        double x = scanner.nextDouble();
        System.out.print("Type the second number: ");
        double y = scanner.nextDouble();
        System.out.println("Result = " + (x * y));
    }

    static void div() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the first number: ");
        double x = scanner.nextDouble();
        System.out.print("Type the second number: ");
        double y = scanner.nextDouble();

        if (y == 0)
            System.out.println("Result = Undefined");
        else
            System.out.println("Result = " + (x / y));
    }

    static void exp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the number you want to exponent: ");
        double x = scanner.nextDouble();
        System.out.print("Type the exponent: ");
        double y = scanner.nextDouble();
        System.out.println("Result = " + Math.pow(x,y));
    }

    static void fac() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the first number: ");
        int x = scanner.nextInt();
        int factorial = 1;

        for (int i = 1; i <= x; i++) {
            factorial = factorial * i;
        }
        System.out.println("Result = " + factorial);
    }

    static void mod() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the first number: ");
        double x = scanner.nextDouble();
        System.out.print("Type the second number: ");
        double y = scanner.nextDouble();
        System.out.println("Result = " + (x % y));
    }

    static void measure() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the length of one side of the rectangle: ");
        double x = scanner.nextDouble();
        System.out.print("Type the length of the other side of the rectangle: ");
        double y = scanner.nextDouble();
        System.out.println("Area = " + (x * y));
        System.out.println("Perimeter = " + 2 * (x + y));
    }
}