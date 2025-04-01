import java.util.Scanner;

class GCD {
    public static void main(String[] args) {

        System.out.println("\nWelcome to GCD\n\n");
        int first = gcd();
        System.out.println();
        int second = gcd();
        int gcd = gcdWork(first, second);
        System.out.println();
        System.out.println("GCD of two number = " + gcd);
    }

    public static int gcd() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int first = input.nextInt();
        
        return first;
    }

    public static int gcdWork(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int least = least(num1, num2);
        while (i <= least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }

        return gcd;
    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        } else {
            return num2;
        }

    }
}