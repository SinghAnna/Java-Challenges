import java.util.Scanner;

 class SumOffToNum {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        System.out.print("please enter first number = ");
        int num1=num.nextInt();

        System.out.print("please enter second number = ");
        int num2=num.nextInt();
        
        int sum = num1+num2;
        System.out.print("sum of two number is " + sum);
    }
}
