import java.util.Scanner;

class OddSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd sum\n");
        System.out.print("Please enter the number = ");
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("Oddsum till " + num + " is sum " + sum);
    }

    public static int oddSum(int num) {
        int sum = 0;
        int i = 1;
        while (i <= num) {
            sum += i;
            i += 2;
        }
        return sum;
    }
}
