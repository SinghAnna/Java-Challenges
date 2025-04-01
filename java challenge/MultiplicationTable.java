import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("\nWelcome to multimications World\n");
     System.out.print("Please enter the number = ");
     int num = input.nextInt();
     printMultiplicationTable(num);
    }


    public static void printMultiplicationTable(int num){
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }

    }
}
