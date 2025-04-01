import java.util.Scanner;

public class NumberOfOccurences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numArr= ArrayUtility.inputArray();
        System.out.print("Now, enter the number you want to fine: ");
        int num = input.nextInt();
        int occurrence = noOfOccurences(numArr, num);
        System.out.println("your element was found " + occurrence + " times in the array");
    }

    public static int noOfOccurences(int[] numArr , int num){
        int occ = 0;
        int i = 0;
        while (i < numArr.length) {
            if (numArr[i] == num) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}
