import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean leapYear;
        int year;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yıl giriniz: ");
        year = input.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                leapYear = year % 400 == 0;
            } else {
                leapYear = true;
            }
        } else {
            leapYear = false;
        }

        if (leapYear){
            System.out.println(year + " yılı bir artık yıldır !");
        } else {
            System.out.println(year + " yılı bir artık yıl değildir !");
        }
    }
}
