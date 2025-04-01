import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("\nWelcome to palindrome number \n");
        int num = realNumber();
        System.out.println();
        int reverse = reverseWork(num);
        if (num == reverse) {
            System.out.println("number is palindrome number\n");
        } else {
            System.out.println("number is not palindrome \n");
        }

    }

    public static int realNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int first = input.nextInt();

        return first;
    }

    public static int reverseWork(int num) {
        int newNumber = 0;
        while (num > 0) {
            int digit = num % 10;
            newNumber = newNumber * 10 + digit;
            num /= 10;
        }
        return newNumber;
    }
}
