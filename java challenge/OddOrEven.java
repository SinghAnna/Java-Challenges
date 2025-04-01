import java.util.Scanner;

class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even calculator\n");
        System.out.print("please enter your number  = ");
        int num = input.nextInt();
       
        if (num % 2 == 0) {
            System.out.println("Number is Even: " + num);
        }else{
            System.out.println("Number is Odd: " + num);
        }
    }
}
