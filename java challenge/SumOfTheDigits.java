import java.util.Scanner;

public class SumOfTheDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum of digits:\n");
        System.out.print("Please enter the number  = ");
        int num = input.nextInt();
        int sum = sumOfDigitws(num);
        System.out.println("Sum of Digits is: = " + sum);

    }

    public static int sumOfDigitws(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + (num % 10);
            num /= 10;
        }

        return sum;
    }

}
