import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\nWelcome to prime Number Checker\n");
        System.out.print("please enter your number: ");
        int num = input.nextInt();
        boolean isPrime = isPrime(num);
        
        if (isPrime) {
            System.out.println("your number is prime");
        } else {
            System.out.println("your number is not prime");
        }

    }

    public static boolean isPrime(int num) {
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
