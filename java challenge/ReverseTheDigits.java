import java.util.Scanner;

class ReverseTheDigits {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Reverse or parllel world\n");
        int num = reverse();
        int reverse = reverseWork(num);
        System.out.println("reverse of number is : " + reverse);

    }

    public static int reverse() {
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
