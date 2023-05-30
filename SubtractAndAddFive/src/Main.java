import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Type a number: ");
        int num = input.nextInt();
        processNumber(num, num, -1);
    }

    static void processNumber(int constantNum, int variableNum, int sign)
    {
        if(variableNum > constantNum)
            return;

        if(variableNum < 1)
            sign *= -1;

        System.out.print(" " + variableNum + " ");
        processNumber(constantNum, variableNum  + sign * 5, sign);
    }
}