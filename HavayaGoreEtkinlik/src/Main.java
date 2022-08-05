import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double heat;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığı kaç santigrat?: ");
        heat = input.nextDouble();
        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat < 15) {
            System.out.println("Sinemaya gidebilirisiniz.");
        } else if (heat < 25) {
            System.out.println("Pikniğe gidebilirsiniz.");
        } else if (heat >= 25) {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
