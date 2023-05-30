public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindromic(111));
        }

        public static boolean isPalindromic(int number) {
            int temp = number, reversedNumber = 0, lastDigit;

        while (temp != 0) {
            lastDigit = temp % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            temp = temp / 10;
        }

            return number == reversedNumber;
        }
    }