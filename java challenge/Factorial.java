import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to factorial\n");
        System.out.print("Please enter the number = ");
        int num = input.nextInt();
        long fact = factorial(num);

        System.out.println("Factorial is:  " + fact);

    }

    public static long factorial(int num) {
        if (num < 2 && num >= 0) {
            return 1;
        } else if (num < 0) {
            System.out.println("number is invailid number ");
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        if (fact > num) {
            System.out.println();
        } else {
            return fact;
        }
        return fact;
    }
}
