import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {

        System.out.println("\nWelcome to armstong number\n");
        int num = armstrong();
        boolean isarmstrong = isarmstrong(num);
        if (isarmstrong) {
            System.out.println("number is armstrong");
        } else {
            System.out.println("number is not armstrong");
        }

    }

    public static int armstrong() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int first = input.nextInt();

        return first;
    }

    public static boolean isarmstrong(int num) {
        int noOfDigits = noOfDigits(num);
        int numCopy = num;
        int finalNumber = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }

        return finalNumber == numCopy;
    }

    public static int pow(int num1, int num2) {
        int result = 1;
        int i = 0;
        while (i < num2) {
            result *= num1;
            i++;
        }

        return result;
    }

    public static int noOfDigits(int num) {
        int digits = 0;
        while (num >= 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }
}
