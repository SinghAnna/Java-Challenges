import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" please Enter number for chacking number is even or odd: ");
        System.out.print("Now, please Enter the number: ");
        int number = input.nextInt();
 
        int result = number & 1;
        if (result == 1) {
            System.out.println(number + " number is Odd ");
        } else {
            System.out.println(number + " number is Even ");
        }
    }
}
