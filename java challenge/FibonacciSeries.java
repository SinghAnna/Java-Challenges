import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {

        System.out.println("\nWelcome to fibonacchi serices\n");

        int num = gcd();
        System.out.println("here is the fibonacci series: ");
        printFibonacci(num);
    }

    public static int gcd() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number up to which series has to be printed: ");
        int first = input.nextInt();

        return first;
    }

    public static void printFibonacci(int num) {
        if (num < 0)
            return;
        System.out.print("0 ");
        if (num == 0)
            return;
        System.out.print("1 ");

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }
}
