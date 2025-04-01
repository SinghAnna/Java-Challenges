import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {

        System.out.println("Welcome to LCM\n");
        int First = doingWork();
        System.out.println();
        int Second = doingWork();

        int lcm = lcm(First, Second);
        System.out.println("lsm of two number is = " + lcm);
    }

    public static int doingWork() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int first = input.nextInt();

        return first;
    }

    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }

    }
}
