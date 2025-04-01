import java.util.Scanner;

public class GreaterNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the world of Three\n");
        System.out.print("please enter first number = ");
        int first = input.nextInt();
        System.out.print("Now, Enter your second number = ");
        int second = input.nextInt();
        System.out.print("Finally, enter third number = ");
        int third = input.nextInt();

        if (first >= second && first >= third) {
            System.out.println(first + " is greater number ");
        }else if (second >= third) {
            System.out.println(second + " is greater number");
        }else{
            System.out.println(third + " is greater number");
        }




    }
}
