import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        System.out.println("average of any arrat list:\n");
        sumArray();

    }

    public static void sumArray() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("please enter range of array list: ");
        n = input.nextInt();
        int[] num = new int[n];
        int i = 0;
        int sum = 0;
        System.out.println("please enter numbers: \n");
        while (i < n) {
            System.out.print("Please enter element no: " + (i + 1) + " = ");
            num[i] = input.nextInt();
            i++;
        }
        System.out.println("\n");
        int j = 0;
        while (j < n) {
            System.out.println("element number " + (j + 1) + " = " + num[j]);
            sum += num[j];
            j++;
        }
        System.out.println("number of sum = " + sum);
        int avrg = sum / n;
        System.out.println("number of average is = " + avrg);

    }

}
